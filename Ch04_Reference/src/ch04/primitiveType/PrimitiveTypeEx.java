package ch04.primitiveType;

public class PrimitiveTypeEx {

	public static void main(String[] args) {
		//아래 변수는 Stack에 생성되었다가
		//main의 영역을 벗어나면 Stack에서 사라짐
		//아래 변수들은 main 함수의 !지역변수!
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 9999999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.printf("byte size : %dbit\n", Byte.SIZE);
		System.out.printf("char size : %dbit\n", Character.SIZE);
		System.out.printf("byte size : %dbit\n", Short.SIZE);
		System.out.printf("short size : %dbit\n", Integer.SIZE);
		System.out.printf("int size : %dbit\n", Long.SIZE);
		System.out.printf("float size : %dbit\n", Float.SIZE);
		System.out.printf("double size : %dbit\n", Double.SIZE);
	}

}
