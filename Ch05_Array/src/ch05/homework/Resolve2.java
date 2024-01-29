package ch05.homework;

public class Resolve2 {
//1. 정수 배열 5개를 할당하고 Arrays.sort를 활용하지 말고 최소값과 최대값을 얻으세요
	public static void main(String[] args) {
		int[] arr = {50, 60, 10, 70, 100};
		int min = arr[0];
		int max = arr[arr.length -1];
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
	}
}
