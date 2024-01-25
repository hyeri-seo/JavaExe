package ch03.for10;

import java.util.Scanner;

public class Resolve3 {
//	3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//	   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
	public static void main(String[] args) {
		//다른 두 변의 길이의 합>가장 긴 변의 길이
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력해주세요. >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// a가 가장 클 때 b+c>a 여야 true
		// b가 가장 클 때 a+c>b 여야 true
		// c가 가장 클 때 a+b>c 여야 true
		boolean condition = false;
		if(a>b && a>c) condition = b+c>a;
		if(b>a && b>c) condition = a+c>b;
		if(c>a && c>b) condition = a+b>c;
		
		System.out.println(condition?
				"입력하신 3개의 수로 삼각형을 만들 수 있습니다.":"입력하신 3개의 수로 삼각형을 만들 수 없습니다.");
	}
}
