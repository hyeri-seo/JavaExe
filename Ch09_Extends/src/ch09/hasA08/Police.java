package ch09.hasA08;

public class Police {
	
	private int clothes;
		
	public Police(int clothes) {
		this.clothes = clothes;
	}
	
	public void putOnCloth() {
		if(clothes > 0) {
			System.out.println("제복을 입었다.");
			clothes--;
		} else {
			System.out.println("입을 제복이 없다.");
		}
	}
}
