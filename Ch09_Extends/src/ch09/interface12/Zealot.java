package ch09.interface12;

public class Zealot implements StarUnit {

	@Override
	public void walk() {
		System.out.println("성큼성큼질럿");
	}

	@Override
	public void attack() {
		System.out.println("휙휙질럿");
	}

	@Override
	public void die() {
		System.out.println("으윽질럿");
	}

}
