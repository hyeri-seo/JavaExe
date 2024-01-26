package ch05.homework;

import java.util.Arrays;

public class Resolve1 {
//1. 정수 배열 5개를 할당하고 Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
	public static void main(String[] args) {
		int[] arr = {50, 60, 10, 70, 100};
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
	}
}
