package ch09.interface12;

public class Hydra implements StarUnit {

	@Override
	public void walk() {
		System.out.println("쿵쿵히드라");
	}

	@Override
	public void attack() {
		System.out.println("퍽퍽히드라");
	}

	@Override
	public void die() {
		System.out.println("꺄악히드라");
	}

}
