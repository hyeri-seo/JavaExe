package ch05.array05;

public class AdvancedForExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] scores = {95, 71,  84, 93, 87};
		//배열 항목 전체 합 구하기
		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
		for(int score: scores) {
			sum += score;
		}
		System.out.println("총점: " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균: " + avg);
	}

}
