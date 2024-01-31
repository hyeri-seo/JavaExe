package ch008.class09.Resolve2;

import java.util.Scanner;

//2. 중화요리집을 임의대로 클래스로 만드세요
public class ChineseRestaurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChineseRestaurant rest = 
				new ChineseRestaurant(sc, "보배반점", 
						new String[]{"짜장면", "짬뽕", "탕수육", "유린기", "유산슬"});
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		sc.close();
	}
}
