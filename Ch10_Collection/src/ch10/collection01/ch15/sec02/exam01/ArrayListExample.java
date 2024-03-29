package ch10.collection01.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);	//5개
		System.out.println();
		
		//2번째 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() 
							+ "\t" + board.getWriter()); //제목3 내용3 글쓴이3
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() 
								+ "\t" + board.getWriter());
		}	//전부 출력
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		//2번 인덱스를 삭제하면 3번 인덱스가 3번 인덱스로 변경되므로 다시 2번 인덱스를 제거할 수 있음
		
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() 
								+ "\t" + board.getWriter());
		}	//1, 2, 5 출력
	}

}
