package ch15.thread01.ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	//main함수는 main 스레드가 해야 할 일
	public static void main(String[] args) {
		//main스레드가 workThread 일 시킴
		Thread thread = new Thread() {
			//workThread가 해야 할 일
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
		//work스레드 작업 시작해라
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
