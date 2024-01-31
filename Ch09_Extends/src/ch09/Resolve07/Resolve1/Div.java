package ch09.Resolve07.Resolve1;

public class Div{

	public int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate(Div div) {
		return div.a / div.b;
	}
}
