package ch05.array06;

import java.util.Arrays;

//배열의 얕은 복사/깊은 복사
public class ArrayEx {

	public static void main(String[] args) {
		//얕은 복사: 위치 정보만 복사됨(그래서 hashCode가 같음)
		int[] scores = {100, 88, 95, 67, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		System.out.println(Arrays.toString(scores));	//[100, 88, 95, 67, 75]
		System.out.println(Arrays.toString(scores1));	//[100, 88, 95, 67, 75]
		System.out.println(Arrays.toString(scores2));	//[100, 88, 95, 67, 75]
		System.out.println(scores);		//[I@2f4d3709
		System.out.println(scores1);	//[I@2f4d3709
		System.out.println(scores2);	//[I@2f4d3709
		System.out.println();
		
		scores[2] = 99999;
		System.out.println(Arrays.toString(scores));	//[100, 88, 99999, 67, 75]
		System.out.println(Arrays.toString(scores1));	//[100, 88, 99999, 67, 75]
		System.out.println(Arrays.toString(scores2));	//[100, 88, 99999, 67, 75]
		System.out.println(scores);		//[I@2f4d3709. 번지가 변하지 않음
		
		//깊은 복사
		//: 힙에 별도의 공간을 생성한 후 scores4는 새로 생성한 공간을 가리키게 됨
		//  기존 공간과 분리되는 공간
		int[] scores4 = 
				Arrays.copyOf(scores1, scores1.length);
		System.out.println(Arrays.toString(scores));	//[100, 88, 99999, 67, 75]
		System.out.println(Arrays.toString(scores4));	//[100, 88, 99999, 67, 75]
		System.out.println(scores);		//[I@2f4d3709
		System.out.println(scores4);	//[I@4e50df2e
		
		scores[2] = 111111;
		System.out.println(Arrays.toString(scores));	//[100, 88, 111111, 67, 75] 얘만 달라짐
		System.out.println(Arrays.toString(scores4));	//[100, 88, 99999, 67, 75]
		System.out.println(scores);		//[I@2f4d3709
		System.out.println(scores4);	//[I@4e50df2e
	}
}
