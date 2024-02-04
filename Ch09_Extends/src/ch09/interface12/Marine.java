package ch09.interface12;

public class Marine implements StarUnit {

	@Override
	public void walk() {
		System.out.println("아장마린");
	}

	@Override
	public void attack() {
		System.out.println("두두두두마린");
	}

	@Override
	public void die() {
		System.out.println("으악마린");
	}

}
