package ch09.isKindOf06;

public class ForcePolice extends Police {
	
	public ForcePolice(int bullet, int handCuffs) {
		super(bullet, handCuffs);
	}
	
	public void run() {
		System.out.println("Running");
	}
	
	public void fight() {
		System.out.println("Fighting!");
	}
}
