package ch05.array03;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		 /*
		  * 배열의 초기화
		  *	배열은 클래스이고 kor은 참조값(해시코드)이 들어있고
		  *	실제 배열의 값들은 힙(heap) 메모리에 위치함
		  *
		  *	정식 선언은 int[] kor = new int[3]이지만
		  * 프로그래머의 편의를 위해 아래처럼 초기화를 허용함
		  */
		
		int[] kor = { 98, 99, 89 };
		System.out.println("kor 배열의 크기: " + kor.length);

		int[] math = { 100, 80, 78, 68, 90 };
		System.out.println("math 배열의 크기: " + math.length);
		
		int[] eng = new int[] { 100, 80, 78, 68 };
		System.out.println("eng 배열의 크기: " + eng.length);
		
		//배열 전체를 출력하는 방법
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(math));
		System.out.println(Arrays.toString(eng));
		System.out.println();
		
		//for문과 인덱스를 이용해서 배열에 저장된 값을 출력하는 방법
		for(int i=0; i<kor.length; i++) System.out.print(kor[i] + " ");
		System.out.println();
		for(int i=0; i<math.length; i++) System.out.print(math[i] + " ");
		System.out.println();
		for(int i=0; i<eng.length; i++) System.out.print(eng[i] + " ");
	}
}
