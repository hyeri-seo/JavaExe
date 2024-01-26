package ch05.resolve;

public class Resolve4 {
	/*
	 * 4. int배열을 10개 생성하세요.
	 * int배열에 3의 배수를 차례대로 저장하세요.
	 * 그리고 거꾸로 출력하세요.
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*3;
		}
		for(int i=arr.length-1; i>=0; i--) System.out.print(arr[i] + " ");
	}
}
