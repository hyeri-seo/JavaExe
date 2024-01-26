package ch05.array08;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		//arr은 1차원 배열을 가리키는 3개의 참조변수 배열
		int[][] arr = new int[3][];
		//arr의 배열요소는 1차원 배열을 가리킴(참조값)
		arr[0] = new int[2];
		arr[1] = new int[2];
		arr[2] = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i*3 + j;
			}
		}
		System.out.println(arr);						//[[I@2f4d3709
		System.out.println(Arrays.toString(arr));		//[[I@4e50df2e, [I@1d81eb93, [I@7291c18f]
		for(int[] temp : arr) {
			System.out.println(Arrays.toString(temp));	//[0, 1] [3, 4] [6, 7]
		}
	}
}
