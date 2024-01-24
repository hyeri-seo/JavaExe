package ch02.operator04;

public class ComOperator {
	public static void main(String[] args) {
		int num0 = 100;
		int num1 = 10;
		int num2 = 100;
		
		// 비교연산자 >, ==가 먼저 실행되고 난 후 대입연산자인 =이 실행됨
		boolean bVal = num0 > num1; //100 > 10
		System.out.println(bVal);	//true
		bVal = num0 < num1;			//100 < 10
		System.out.println(bVal);	//false
		bVal = num0 == num2;		//100 == 10
		System.out.println(bVal);	//true
		bVal = num0 >= num2;		//100 >= 10
		System.out.println(bVal);	//true
	}

}
