package ch09.extends05;

public class GrandFather {
	private int handsomeScore;
	
	GrandFather(int handsomeScore) {
		this.handsomeScore = handsomeScore;
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("잘생겼다~");
	}
	
	public int getHandsomeScore() {
		return handsomeScore;
	}
}
