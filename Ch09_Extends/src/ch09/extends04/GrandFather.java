package ch09.extends04;

public class GrandFather {
	int handsomeScore;
	
	GrandFather(int handsomeScore) {
		this.handsomeScore = handsomeScore;
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("잘생겼다~");
	}
}
