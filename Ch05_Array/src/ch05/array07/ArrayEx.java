package ch05.array07;

import java.util.Arrays;

public class ArrayEx {
	/*
	 * 배열의 오름차순 정렬
	 * Arrays.sort(배열 변수);			//데이터가 적을 때
	 * Arrays.parallelSort(배열 변수); //데이터가 많을 때
	 */

	public static void main(String[] args) {
		int[] scores = {98, 12, 52, 93, 33, 54, 21};
		System.out.println(Arrays.toString(scores));
		
		//정렬
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
	}
}
