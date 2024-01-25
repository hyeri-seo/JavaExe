package ch03.control03;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 점수 입력 >> ");
		score = sc.nextInt();
		
		//위의 조건문의 조건식이 false일 때 아래 조건문을 실행한다.
		if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else
			System.err.println("F학점");
		
		sc.close();
	}

}
