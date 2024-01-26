package ch05.resolve;

public class Resolve2 {
	//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
	public static void main(String[] args) {
		String[] names = {"가영", "나영", "다영", "라영", "마영", "바영", "사영", "아영", "자영", "차영"};
		for(int i=(names.length-1); i>=0; i--) System.out.print(names[i] + " ");
	}
}
