package ch06.method01;

import java.util.Scanner;

//4. gugudan(3);
//구구단 메서드를 void 리턴형으로 제작하세요.
//3을 입력하면 3단이 출력됩니다.
public class Resolve4 {
	public static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2부터 9까지의 수 중 하나를 입력해주세요. >> ");
		int dan = sc.nextInt();
		gugudan(dan);
		sc.close();
	}
}
