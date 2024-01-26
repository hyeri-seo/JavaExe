package ch05.array02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int 변수가 들어갈 공간 3개를 만들어줘~ 대표 이름은 kor
		int[] kor = new int[3];
		
		/*
		 * kor[i] : i를 인덱스라고 함.
		 * 			i는 0이 시작이고 마지막 인덱스는 항상 배열길이-1과 같음
		 * 0이 시작인 이유는 시작점으로부터 공간이 0만큼 떨어져 있기 때문
		 */
		//3명의 국어 점수 입력
		for(int i=0; i<kor.length; i++) {
			System.out.print((i+1) + "번째 학생의 국어 점수 입력 >> ");
			kor[i] = sc.nextInt();
		}
		
//		System.out.print("1번째 학생의 국어 점수 입력 >> ");
//		kor[0] = sc.nextInt();
//		System.out.print("2번째 학생의 국어 점수 입력 >> ");
//		kor[1] = sc.nextInt();
//		System.out.print("3번째 학생의 국어 점수 입력 >> ");
//		kor[2] = sc.nextInt();
		
		int total = 0;
		for(int i=0; i<kor.length; i++) total += kor[i];
//		int total = kor[0] + kor[1] + kor[2];
		
		double avg = (double)total/kor.length;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);	//소수점 두 자리 수까지 나타내기 위해 .2
		
		sc.close();
	}

}
