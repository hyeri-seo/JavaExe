package ch15.thread01.ch14.sec06.exam01;

public class User1Thread extends Thread {
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {	//외부에서 공유 객체만 Calculator를 받아 필드에 저장
		this.calculator = calculator;
	}
	
	@Override
	public void run() {	//동기화 메소드 호출
		calculator.setMemory1(100);
	}
}
