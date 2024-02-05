package ch09.resolve14.resolve1;

public class InkjetPrinter extends Printer {
	private double inkRemaining;	//잉크 잔량
	
	public InkjetPrinter() {}
	public InkjetPrinter(String model, String manufacturer, 
			P_INTERFACE interfaceType, int paperRemaining, double inkRemaining) {
		super(model, manufacturer, interfaceType, paperRemaining);
		this.inkRemaining = inkRemaining;
	}
	
	@Override
	public void print() {
		if(paperRemaining > 0 && inkRemaining > 0) {
			System.out.println("인쇄가 진행됩니다.");
			printCount++;
			paperRemaining--;
			inkRemaining -= 0.1;
		} else if(paperRemaining > 0 && inkRemaining == 0){
			System.out.println("잉크가 부족합니다.");
		} else if(paperRemaining == 0 && inkRemaining > 0){
			System.out.println("용지가 부족합니다.");
		} else {
			System.out.println("용지와 잉크가 부족합니다.");
		}
	}
	
	@Override
	public String toString() {
		return "InkjetPrinter [inkRemaining=" + inkRemaining + ", model=" + model + ", manufacturer=" + manufacturer
				+ ", interfaceType=" + interfaceType + ", printCount=" + printCount + ", paperRemaining="
				+ paperRemaining + "]";
	}
	
}
