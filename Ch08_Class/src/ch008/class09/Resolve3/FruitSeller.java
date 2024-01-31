package ch008.class09.Resolve3;

import ch008.class09.Resolve3.FruitBuyer;
import ch008.class09.Resolve3.FruitSeller;

public class FruitSeller {
	private int numOfPear; // 사과개수
	private int saleMoney; // 판매금액
	final static int PEAR_PRICE = 2500; // 사과가격(상수)
	// 인터페이스에서 상수를 만들 때는 자동으로 final을 붙여줘서 쓸 필요가 없음

	public FruitSeller(int numOfApple) {
		this.numOfPear = numOfApple;
	}
	
	public void saleApple(FruitBuyer buyer, int money) {
		FruitSeller seller = new FruitSeller(numOfPear);
		int num = buyer.buyApple(money);
		numOfPear -= num;
		saleMoney += money;
	}

	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 배: " + numOfPear);
		System.out.println("판매 수익: " + saleMoney);
	}
}
