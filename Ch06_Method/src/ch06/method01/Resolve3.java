package ch06.method01;

import java.util.Scanner;

//3. int result = total(10, 100);
//위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//total메서드를 작성하고 사용해보세요.
public class Resolve3 {
	public static int total(int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) sum += i;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("처음으로 더할 수를 입력해주세요. >> ");
		int x = sc.nextInt();
		System.out.print("마지막으로 더할 수를 입력해주세요. >> ");
		int y = sc.nextInt();
		int result = total(x, y);
		System.out.println(x + "부터 " + y + "까지의 누적합: " + result);
		sc.close();
	}
}
