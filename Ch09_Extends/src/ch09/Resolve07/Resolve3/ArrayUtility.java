package ch09.Resolve07.Resolve3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtility {
	
	public int[] intArr = new int[5];
	public double[] doubArr = new double[5];
	public Scanner sc;
	
	public ArrayUtility(Scanner sc, int[] intArr) {
		this.sc = sc;
		this.intArr = intArr;
		System.out.println("입력하신 정수 배열은 " + Arrays.toString(intArr) + "입니다.");
	}
	
	public ArrayUtility(Scanner sc, double[] doubArr) {
		this.sc = sc;
		this.doubArr = doubArr;
		System.out.println("입력하신 실수 배열은 " + Arrays.toString(doubArr) + "입니다.");
	}
	
	public static double[] intToDouble(int[] intArr) {
		double[] doubArr = new double[5];
 		for(int i=0; i<intArr.length; i++) {
 			doubArr[i] = intArr[i]*1.0;
		}
		return doubArr;
	}
	
	public static int[] doubleToInt(double[] doubArr) {
		int[] intArr = new int[5];
		for(int i=0; i<doubArr.length; i++) {
			intArr[i] = (int)doubArr[i];
		}
		return intArr;
	}
}
