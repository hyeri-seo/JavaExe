package ch09.resolve14.resolve1;

public class Printer{
	protected String model;			//모델명
	protected String manufacturer;	//제조사
	protected P_INTERFACE interfaceType;	//인터페이스 종류
	protected int printCount;		//인쇄 매수
	protected int paperRemaining;	//인쇄 종이 잔량
	
	public Printer() {}
	
	public Printer(String model, String manufacturer, 
			P_INTERFACE interfaceType, int paperRemaining) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.interfaceType = interfaceType;
		this.printCount = 0;
		this.paperRemaining = paperRemaining;
	}
	
	public void print() {
		if(paperRemaining > 0) {
			System.out.println("인쇄가 진행됩니다.");
			printCount++;
			paperRemaining--;
		} else {
			System.out.println("용지가 부족합니다.");
		}
	}

}
