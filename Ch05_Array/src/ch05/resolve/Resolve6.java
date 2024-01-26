package ch05.resolve;

import java.util.Scanner;

public class Resolve6 {
//	6. 5명의 학생의 이름과 점수를 입력받고
//	   해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//	  A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		int[] scores = new int[5];
		for(int i=0; i<names.length; i++) {
			System.out.print("학생의 이름을 입력해주세요. >> ");
			names[i] = sc.next();
			System.out.print("학생의 점수를 입력해주세요. >> ");
			scores[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=90) {
				System.out.println(names[i]+" 학생의 학점은 A입니다.");
			} else if(scores[i]>=80) {
				System.out.println(names[i]+" 학생의 학점은 B입니다.");				
			} else if(scores[i]>=70) {
				System.out.println(names[i]+" 학생의 학점은 C입니다.");				
			} else if(scores[i]>=60) {
				System.out.println(names[i]+" 학생의 학점은 D입니다.");				
			} else {
				System.out.println(names[i]+" 학생의 학점은 F입니다.");				
			}
		}
	}
}
