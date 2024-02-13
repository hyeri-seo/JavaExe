package ch15.thread01.ch14.sec06.exam01;

public class User2Thread extends Thread {
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(Calculator calculator) {	//외부에서 공유 객체만 Calculator를 받아 필드에 저장
		this.calculator = calculator;
	}
	
	@Override
	public void run() {	//동기화 블록을 가진 메소드 호출
		calculator.setMemory2(50);
	}
}
