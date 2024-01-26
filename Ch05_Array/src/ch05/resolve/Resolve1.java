package ch05.resolve;

public class Resolve1 {
	//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
	public static void main(String[] args) {
		String[] names = {"가영", "나영", "다영", "라영", "마영", "바영", "사영", "아영", "자영", "차영"};
		for(int i=0; i<names.length; i++) System.out.print(names[i] + " ");
	}
}
