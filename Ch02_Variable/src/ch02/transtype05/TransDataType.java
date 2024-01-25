package ch02.transtype05;

public class TransDataType {

	public static void main(String[] args) {
		int total = 297;	//총점
		int stNum = 4;		//학생 수
		double avg = 0.;	//평균 점수
		System.out.println("총점은 " + total + "입니다.");
		avg = total/stNum;
		System.out.println("평균은 " + avg + "입니다."); //74.0
		// (double)total: 컴파일러에 의해 정수 total은 double로 형변환
		/* 실수와 정수 연산의 결과는?
		 * 실수의 표현 범위 > 정수의 표현 범위
		 * 결과값은 실수 자료형으로 나온다. */
		avg = (double)total/stNum;
		System.out.println("평균은 " + avg + "입니다.");//74.25
		
		//만약 정수까지만 결과를 내고 싶다면?
//		int nAvg = avg; //dobule을 int로 바꿀 수 없으므로 오류가 남
		int nAvg = (int)avg; //따라서 dobule을 int로 강제 형변환을 해줘야 함
		System.out.println("평균은 " + nAvg + "입니다.");
		
		char ch = 'A';	//내부적으로는 유니코드로 저장돼서 숫자로 저장됨
		//아스키코드 값: 영대 65~90, 영소 97~122
		System.out.println(ch);
		System.out.println((int)ch);  //65
		System.out.println((int)'a'); //97
		System.out.println((char)66); //B
		System.out.println((char)98); //b
	}

}
