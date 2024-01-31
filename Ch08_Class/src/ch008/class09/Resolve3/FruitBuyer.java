package ch008.class09.Resolve3;

import ch008.class09.Resolve3.FruitSeller;

public class FruitBuyer {
	private int money;		//가진 돈
	private int numOfPear;	//구매한 사과 개수
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfPear = numOfPear;
	}

	public int buyApple(int money) {
		this.money -= money;
		this.numOfPear += money/FruitSeller.PEAR_PRICE;
		return numOfPear;
	}
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액: " + money);
		System.out.println("배 개수: " + numOfPear);
	}
}
