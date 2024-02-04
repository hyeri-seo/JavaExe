package ch09.interface12;

public class Scv implements StarUnit {

	@Override
	public void walk() {
		System.out.println("스륵Scv");
	}

	@Override
	public void attack() {
		System.out.println("징징Scv");
	}

	@Override
	public void die() {
		System.out.println("펑Scv");
	}

}
