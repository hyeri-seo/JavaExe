package ch008.class03;

public class ArithEx {
	/*
	 * static 메서드는 객체를 만들지 않아도 바로 사용 가능하다.
	 */
	public static void main(String[] args) {
		int a = 10, b = 5;
		int result = 0;
		result = Arith.add(a, b);
		System.out.println(result);
		result = Arith.minus(a, b);
		System.out.println(result);
		result = Arith.mul(a, b);
		System.out.println(result);
		result = Arith.div(a, b);
		System.out.println(result);
	}
}
