package ch05.resolve;

import java.util.Scanner;

public class Resolve3 {
	//3. 7명의 학생의 점수를 입력받고 총점과 평균을 출력하세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[7];
		int total = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1) + "번째 학생의 점수를 입력해주세요. >> ");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		sc.close();
		int avg = total/scores.length;
		System.out.println("학생들의 총점은 " + total + "입니다.");
		System.out.println("학생들의 평균 점수는 " + avg + "입니다.");
	}
}
