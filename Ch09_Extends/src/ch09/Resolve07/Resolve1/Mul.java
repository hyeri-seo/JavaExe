package ch09.Resolve07.Resolve1;

public class Mul{

	public int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate(Mul mul) {
		return mul.a * mul.b;
	}
}
