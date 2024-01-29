package ch06.method01;

import java.util.Scanner;

//5. star(5);
//을 입력하면 
//*
//**
//***
//****
//*****
//위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
public class Resolve5 {
	public static void star(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. >> ");
		int num = sc.nextInt();
		star(num);
		sc.close();
	}
}
