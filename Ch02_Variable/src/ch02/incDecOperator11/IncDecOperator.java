package ch02.incDecOperator11;

public class IncDecOperator {

	public static void main(String[] args) {
		int num = 0;
		// num++과 ++num은 모두 num의 값을 1 증가시킨다.
		num++;
		System.out.println(num); // num += 1, num = num + 1
		++num;
		System.out.println(num);

		// 후위 증가 연산자. num 값을 대입한 후 num의 값을 1 증가
		int result = num++;
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		
		// 전위 증가 연산자. num의 값을 1 증가시킨 후 num을 대입
		result = ++num;
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		
		// 감소 연산자
		System.out.println("num=" + num--);
		System.out.println("num=" + --num);
	}

}
