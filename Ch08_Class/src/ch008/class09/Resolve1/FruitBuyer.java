package ch008.class09.Resolve1;

public class FruitBuyer {
	private int money;		//가진 돈
	private int numOfApple;	//구매한 사과 개수
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = numOfApple;
	}

	public int buyApple(int money) {
		this.money -= money;
		this.numOfApple += money/FruitSeller.APPLE_PRICE;
		return numOfApple;
	}
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액: " + money);
		System.out.println("사과 개수: " + numOfApple);
	}
}

