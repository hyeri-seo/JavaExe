package ch06.method01;

import java.util.Scanner;

//2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다
public class Resolve2 {
	public static int minus(int x, int y) {
		if(x >= y) return x - y;
		else return y - x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 수를 입력해주세요. >> ");
		int x = sc.nextInt();
		System.out.print("2번째 수를 입력해주세요. >> ");
		int y = sc.nextInt();
		int result = minus(x, y);
		System.out.println("두 수의 차의 절대값: " + result);
		sc.close();
	}
}
