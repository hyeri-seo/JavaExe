package ch09.resolve14.resolve1;

public class LaserPrinter extends Printer {
private int tonnerRemaining;	//토너 잔량
	
	public LaserPrinter() {}
	public LaserPrinter(String model, String manufacturer, 
			String interfaceType, int paperRemaining, int tonnerRemaining) {
		super(model, manufacturer, interfaceType, paperRemaining);
		this.tonnerRemaining = tonnerRemaining;
	}
	
	@Override
	public void print() {
		if(paperRemaining > 0 && tonnerRemaining > 0) {
			System.out.println("인쇄가 진행됩니다.");
			printCount++;
			paperRemaining--;
			tonnerRemaining--;
		} else if(paperRemaining > 0 && tonnerRemaining == 0){
			System.out.println("토너가 부족합니다.");
		} else if(paperRemaining == 0 && tonnerRemaining > 0){
			System.out.println("용지가 부족합니다.");
		} else {
			System.out.println("용지와 토너가 부족합니다.");
		}
	}
}
