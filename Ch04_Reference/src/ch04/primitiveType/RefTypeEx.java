package ch04.primitiveType;

import java.util.Arrays;

public class RefTypeEx {

	public static void main(String[] args) {
		// 클래스는 Reference type(참조 타입이다)
		int[] arr = {10, 20, 30};	//배열
		String name = "홍길동";		//String 클래스
		int[] arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		String name1 = new String("임꺽정");
		
		System.out.println(Arrays.toString(arr));	//[10, 20, 30]
		System.out.println(name);					//홍길동
		System.out.println(Arrays.toString(arr1));	//[1, 2, 3]
		System.out.println(name1);					//임꺽정
		
		System.out.println();
		
		//hashCode: 스택 영역에 있는 변수가 가리키는 값
		//스택 영역은 금방 사라지니까 스택 영역에서 hashCode로 값만 갖고 있는 거임
		//객체 자체는 힙 영역에 저장되어 있음. 힙 영역은 규모가 크니까
		//JVM이 해석을 해줌
		System.out.println(arr.hashCode());			//793589513
		System.out.println(name.hashCode());		//54150062
		System.out.println(arr1.hashCode());		//1313922862
		System.out.println(name1.hashCode());		//50521980
	}
}
