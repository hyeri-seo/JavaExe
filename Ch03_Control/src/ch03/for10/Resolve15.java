package ch03.for10;

import java.util.Scanner;

public class Resolve15 {
//	15. 사용자로부터 정수를 입력받습니다.
//	   입력 받은 값을 계속 더합니다
//	   사용자가 0을 입력하면 합을 출력합니다
//	   프로그램을 종료합니다.
	public static void main(String[] args) {
		int input = 1;
		int sum = 0;
		while(input != 0) {
			System.out.print("더하고 싶은 숫자를 입력해주세요. 0을 입력하면 프로그램을 종료합니다. >> ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("합 = " + sum);
	}

}
