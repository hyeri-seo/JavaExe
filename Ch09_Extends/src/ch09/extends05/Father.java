package ch09.extends05;

public class Father extends GrandFather{
	private long money;

	Father(int handsomeScore, long money) {
		super(handsomeScore);	//GrandFather의 매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}
	
	void wealth() {
		System.out.println("돈을 많이 벌었다ㅎㅎ");
	}
}
