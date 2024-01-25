package ch03.for10;

import java.util.Scanner;

public class Resolve2 {
//	2. 369게임을 작성합니다.
//	   1~99까지의 정수를 입력받고
//	   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//	   2개가 있으면 "박수짝짝"을 출력하세요
//	   예를 들어 13은 "박수짝"
//	   36인 경우는 "박수짝짝"을 출력하면 됩니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 99까지의 정수 중 하나를 입력하세요. >> ");
		int input = sc.nextInt();
		int count = 0;
		
		int m = input/10;
		int n = input%10;

		if(m==3 || m==6 || m==9) count++;
		if(n==3 || n==6 || n==9) count++;
		
		if(count == 2) {
			System.out.println("박수짝짝");
		} else if(count == 1) {
			System.out.println("박수짝");
		}
		sc.close();
	}
}
