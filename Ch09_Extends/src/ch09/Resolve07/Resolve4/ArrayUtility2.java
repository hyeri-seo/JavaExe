package ch09.Resolve07.Resolve4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtility2 {

	public int[] intArr1 = new int[5];
	public int[] intArr2 = new int[5];
	public Scanner sc;

	public ArrayUtility2(Scanner sc, int[] intArr1, int[] intArr2) {
		this.sc = sc;
		this.intArr1 = intArr1;
		this.intArr2 = intArr2;
		System.out.println("입력하신 첫 번째 정수 배열은 " + Arrays.toString(intArr1) + "입니다.");
		System.out.println("입력하신 두 번째 정수 배열은 " + Arrays.toString(intArr2) + "입니다.");
	}

	public static int[] concat(int[] intArr1, int[] intArr2) {
		int[] newArr = new int[intArr1.length + intArr2.length];
		System.arraycopy(intArr1, 0, newArr, 0, intArr1.length);
		System.arraycopy(intArr2, 0, newArr, intArr1.length, intArr2.length);
		return newArr;
	}

	public static int[] remove(int[] intArr1, int[] intArr2) {
		int cnt = 0;
		boolean isEqual;

		for (int i = 0; i < intArr1.length; i++) {
			for (int j = 0; j < intArr2.length; j++) {
				if (intArr1[i] == intArr2[j]) {
					cnt++;
					break;
				}
			}
		}

		int[] newArr = new int[intArr1.length - cnt];
		int index = 0;

		for (int i = 0; i < intArr1.length; i++) {
			isEqual = false;
			for (int j = 0; j < intArr2.length; j++) {
				if (intArr1[i] == intArr2[j]) {
					isEqual = true;
					break;
				}
			}
			if (!isEqual) {
				newArr[index++] = intArr1[i];
			}
		}
		
		return newArr;
	}
}
