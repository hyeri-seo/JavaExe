package ch02.variable01;

public class DataType {
	public static void main(String[] args) {
		int num = 100; 			//정수
		double dnum = 3.14; 	//실수
		char ch = 'a'; 			//문자 하나
		String name = "홍길동"; 	//문자열
		boolean isRun = true; 	//참, 거짓
		String str = "a"; 		//문자열인데 문자가 하나일 뿐
		// 자료형 변수공간이름 = 값
		System.out.println(num);
		num = 999;				//num에 999를 저장
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(name);
		System.out.println(isRun);
		System.out.println(str);
	}

}
