package ch05.homework;

import java.util.Arrays;

//3. 정수 배열 5개를 할당하고
//System.out.println(Arrays.toString(numArr));
//로 배열을 출력했을 때 거꾸로 출력되도록 배열의 값을 거꾸로 저장하세요.
public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = { 3, 5, 4, 1, 2 };		
		for(int i=0; i<numArr.length/2; i++) {
			int temp = numArr[i];
			numArr[i] = numArr[numArr.length-1-i];
			numArr[numArr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
