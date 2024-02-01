package ch09.hasA08;

public class NursePolice extends Police {
	
	private int thermometers;
	
	public NursePolice(int clothes, int thermometers) {
		super(clothes);
		this.thermometers = thermometers;
	}
	
	public void calcThermometer() {
		if(thermometers > 0) {
			System.out.println("Check 36.5 Temp");
			thermometers--;
		} else {
			System.out.println("No Check Temp");
		}
	}
}
