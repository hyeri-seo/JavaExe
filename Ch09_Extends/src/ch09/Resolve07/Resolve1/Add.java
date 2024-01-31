package ch09.Resolve07.Resolve1;

public class Add{
	
	public int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate(Add add) {
		return add.a + add.b;
	}

}
