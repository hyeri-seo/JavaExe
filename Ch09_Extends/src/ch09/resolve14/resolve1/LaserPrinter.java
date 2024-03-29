package ch09.resolve14.resolve1;

public class LaserPrinter extends Printer {
private double tonnerRemaining;	//토너 잔량
	
	public LaserPrinter() {}
	public LaserPrinter(String model, String manufacturer, 
			P_INTERFACE interfaceType, int paperRemaining, double tonnerRemaining) {
		super(model, manufacturer, interfaceType, paperRemaining);
		this.tonnerRemaining = tonnerRemaining;
	}
	
	@Override
	public void print() {
		if(paperRemaining > 0 && tonnerRemaining > 0) {
			System.out.println("인쇄가 진행됩니다.");
			printCount++;
			paperRemaining--;
			tonnerRemaining *= 0.99;
		} else if(paperRemaining > 0 && tonnerRemaining == 0){
			System.out.println("토너가 부족합니다.");
		} else if(paperRemaining == 0 && tonnerRemaining > 0){
			System.out.println("용지가 부족합니다.");
		} else {
			System.out.println("용지와 토너가 부족합니다.");
		}
	}
	
	@Override
	public String toString() {
		return "LaserPrinter [tonnerRemaining=" + tonnerRemaining + ", model=" + model + ", manufacturer="
				+ manufacturer + ", interfaceType=" + interfaceType + ", printCount=" + printCount + ", paperRemaining="
				+ paperRemaining + "]";
	}

}
