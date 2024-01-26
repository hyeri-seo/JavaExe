package ch03.for10;

import java.util.Scanner;

public class Resolve14 {
//	14. 입력받은 숫자의 구구단을 출력하세요
//	   예를 들어 3을 입력하면 
//	   3 x 1 = 3
//	   3 x 2 = 6
//	   ...
//	   3 x 9 = 27
	public static void main(String[] args) {
		System.out.print("2부터 9까지의 숫자 중 하나를 입력해주세요. >> ");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i=1; i<=9; i++) System.out.println(dan + " x " + i + " = " + dan*i);
		sc.close();
	}
}
