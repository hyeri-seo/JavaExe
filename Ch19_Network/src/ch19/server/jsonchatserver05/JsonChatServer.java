package ch19.server.jsonchatserver05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

import org.json.JSONObject;

/*
 * 1) EchoServer
 * - 서버 소켓의 동작 방식
 * - 2개 이상의 소켓 필요(서버 소켓(accept), 통신 소켓(send/receive))
 * 2) EchoMultiTrheadServer
 * - 병렬 처리를 위해 Client 1개당 Thread 1개를 배정
 * 3) JsonChatServer
 * - 다양한 업무 처리를 위해서 Json 포맷 사용(패킷)
 * - 채팅은 한 사람한테 수신된 데이터를 다른 사람한테 전달해야 함
 * 	 그러므로 사용자 등록/관리가 필요함(HashTable = HashMap + 동기화)
 */
public class JsonChatServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		Hashtable clientHt = new Hashtable();	// 접속자를 등록/관리하는 테이블
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			/* main thread는 계속 accept() 처리를 담당함 */
			while(true) {
				System.out.printf("[서버 - %s] Client 접속을 기다립니다...", mainThreadName);	
				Socket socket = serverSocket.accept();
				
				/* worker thread는 Client와의 통신을 담당함 */
				WorkerThread wt = new WorkerThread(socket, clientHt);
				wt.start();
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
 * [App 프로토콜 정의]
 * 1) 데이터는 '문자열' 데이터로 함
 * 2) '문자열' 데이터는 json을 변환한 것으로 함
 * 3) json 명령 패킷 종류
 * 	  - {}내의 데이터 값을 의미함
 * 	3-1) id 등록
 * 		[요청]
 * 		cmd:ID
 * 		id:{id 값}
 * 
 * 		[응답]
 * 		cmd:ID
 * 		ACK:ok(성공), fail(실패)
 * 
 * 	3-2) 사칙 연산
 * 		[요청]
 * 		cmd:ARITH
 * 		id:{id 값}
 * 		op:{연산자}
 * 		val1:{첫 번째 값}
 * 		val2:{두 번째 값}
 * 
 * 		[응답]
 * 		cmd:ARITH
 * 		ACK:{결과값}
 * 
 * 	3-3) 전체 채팅
 * 		[요청]
 * 		cmd:ALLCHAT
 * 		id:{id 값}
 * 		youid:all
 * 		msg:{문자 메시지}
 * 
 * 		[응답]
 * 		cmd:ALLCHAT
 * 		ACK:ok(성공), fail(실패)
 * 
 * 		[전송]
 * 		cmd:BROADCHAT
 * 		id:{id값}
 * 		msg:{문자메시지}
 * 
 * 	3-4) 1:1 채팅
 * 		[요청]
 * 		cmd:ONECHAT
 * 		id{id 값}
 * 		youid:{상대 id}
 * 		msg:{문자 메시지}
 * 
 * 		[응답]
 * 		cmd:ONECHAT
 * 		ACK:ok(성공), fail(실패)
 * 
 * 		[전송]
 * 		cmd:UNIQCHAT
 * 		id:{id값}
 * 		msg:{문자메시지}
 */

// json 라이브러리 다운로드 후 등록
// https://github.com/stleary/JSON-java

class WorkerThread extends Thread {
	private Socket socket;
	private Hashtable ht;
	
	public WorkerThread(Socket socket, Hashtable ht) {
		this.socket = socket;
		this.ht = ht;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("<서버 - %s>%s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line;
			while(true) {
				/* client가 json오브젝트를 string으로 변환해서 보낸 것을 수신 */
				line = br.readLine();
				if(line == null)
					break;
				
				/* json패킷을 해석해서 알맞은 처리를 함 */
				JSONObject packetObj = new JSONObject(line);
				processPacket(packetObj);
			}
		} catch(Exception e) {
			System.out.printf("<서버 - %s>%s\n", getName(), e.getMessage());
		}
	}
	
	private void processPacket(JSONObject packetObj) throws IOException {
		JSONObject ackObj = new JSONObject();
		String cmd = packetObj.getString("cmd");
		if(cmd.equals("ID")) {
			// 클라이언트 요청 처리
			String id = packetObj.getString("id");
			ht.put(id, this.socket);	//해시테이블에 id와 socket을 등록
			
			//응답
			ackObj.put("cmd", id);
			ackObj.put("ack", "ok");
			
			//Json Obj -> 문자열
			String ack = ackObj.toString();
			
			//클라이언트한테 전송
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
		} else if(cmd.equals("ARITH")) {
			//요청 처리
			String id = packetObj.getString("id");
			String op = packetObj.getString("op");
			Double v1 = packetObj.getDouble("val1");
			Double v2 = packetObj.getDouble("val2");
			double result = arith(op, v1, v2);
			
			//응답
			ackObj.put("cmd", "ARITH");
			ackObj.put("ack", Double.toString(result));
		} else if(cmd.equals("ALLCHAT")) {
			String id = packetObj.getString("id");
			ht.put(id, this.socket);
		} else if(cmd.equals("ONECHAT")) {
			String id = packetObj.getString("id");
			ht.put(id, this.socket);
		}
	}
	
	private double arith(String op, double val1, double val2) {
		double result = 0.;
		switch (op) {
		case "+":
			result = val1+val2;
			break;
		case "-":
			result = val1-val2;
			break;
		case "*":
			result = val1*val2;
			break;
		case "/":
			result = val1/val2;
			break;
		}
		return result;
	}
}
