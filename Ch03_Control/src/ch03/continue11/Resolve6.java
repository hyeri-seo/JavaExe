package ch03.continue11;

public class Resolve6 {
	// 6. for문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.
	// *
	// **
	// ***
	// ****
	// *****
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) System.out.print("*");
			System.out.println();
		}
	}
}
