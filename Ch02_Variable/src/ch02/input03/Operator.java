package ch02.input03;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0;
		
		// 라이브러리(jdk를 포함한)에 존재하는 클래스는
		// ctrl+shift+O를 누르면 자동으로 package 경로를 등록해준다.
		// jdk에서 제공해주는 class. 키보드로부터 입력받는 역할
		Scanner sc = new Scanner(System.in);
		
		System.out.println("더하기 연산을 합니다");
		System.err.print("1번째 숫자 입력 >> ");
		num0 = sc.nextInt(); //입력한 값을 int로 받아라
		System.out.print("2번째 숫자 입력 >> ");
		num1 = sc.nextInt();
		
		// 결과 계산
		// =(대입 연산자)는 우측의 연산이 모두 완료된 후 처리됨
		result = num0 + num1;
		System.out.println("결과는 " + result);
		
		sc.close(); //키보드와 연결을 닫는다.
	}

}
