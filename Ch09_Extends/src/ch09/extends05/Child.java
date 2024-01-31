package ch09.extends05;

public class Child extends Father{
	private float day;
	
	Child(int handsomeScore, long money, float day) {
		super(handsomeScore, money);	//Father의 매개변수 생성자 호출
		this.day = day;
		System.out.println("Child 매개변수 생성자");
	}
	
	void play() {
		System.out.println("노는 게 제일 좋아");
	}
}
