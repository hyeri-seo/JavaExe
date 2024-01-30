package ch06.method01;

import java.util.Scanner;

//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요
public class Resolve1 {
	
	public static int bigNum(int x, int y) {
		if(x > y) {
			return x;
		} else {
			return y;
		}
//		return (x>y)?x:y;
	}
	
	public static int smallNum(int x, int y) {
		if(x > y) {
			return y;
		} else {
			return x;
		}
//		return (x>y)?y:x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 수를 입력해주세요. >> ");
		int x = sc.nextInt();
		System.out.print("2번째 수를 입력해주세요. >> ");
		int y = sc.nextInt();
		int result0 = bigNum(x, y);
		System.out.println("둘 중 더 큰 수: " + result0);
		int result1 = smallNum(x, y);
		System.out.println("둘 중 더 작은 수: " + result1);
		sc.close();
	}
}
