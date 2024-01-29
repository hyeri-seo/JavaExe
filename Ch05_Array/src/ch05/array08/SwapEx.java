package ch05.array08;

public class SwapEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int tmp;
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);
		System.out.println();
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("변경된 a의 값: " + a);
		System.out.println("변경된 b의 값: " + b);
	}
}
