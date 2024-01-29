package ch05.homework;

import java.util.Arrays;

//정수 배열 5개를 할당하고
//Arrays.sort를 사용하지 말고
//배열을 오름차순으로 정렬하도록 저장하세요.
public class Resolve4 {
	public static void main(String[] args) {
		int[] numArr = { 3, 5, 4, 1, 2 };
		for (int i=numArr.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
	}
}
