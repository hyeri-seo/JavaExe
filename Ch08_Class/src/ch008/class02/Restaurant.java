package ch008.class02;

import java.util.Scanner;

/*
 * 클래스는 영역이 확실하다(클래스의 캡슐화)
 * 클래스 = 변수(필드) + 멤버함수(메서드) 
 * 
 * 식당
 * 필드=변수=명사
 * 메서드=함수=동사
 * 
 * [클래스의 대상]
 * 큰 개념의 명사(일반적인 클래스)
 * 동사들의 집합(Controller, Business layer)
 * 필드들의 집합(Vo, Dao)
 */
public class Restaurant {
	// 필드
	public String name;
	public Scanner sc;
	private String[] foods = {"냉면", "떡볶이", "칼국수", "쌀국수", "순대", "튀김", "라면"};
	
	private int selectNum;
	
	// 메서드
	public void viewMenu() {
		System.out.println("---[" + name + "]---");
		for(int i=0; i<foods.length; i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("---[" + name + "]---");
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		System.out.println("---[" + name + "]---");
		String food = foods[selectNum];
		System.out.println(food + "이/가 나왔습니다.");
		System.out.println("맛있게 드세요 ^*^");
	}
}
