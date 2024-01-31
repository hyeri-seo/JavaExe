package ch09.Resolve07.Resolve1;

public class Sub{

	public int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate(Sub sub) {
		return sub.a - sub.b;
	}
}
