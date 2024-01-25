package ch03.for10;

import java.util.Scanner;

public class Resolve12 {
//	12. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=1; i<=input; i++) System.out.println("감사합니다.");
	}
}
