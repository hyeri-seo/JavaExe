package ch008.class08;

public class FruitBuyer {
	private int money;
	private int numOfApple;
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = numOfApple;
	}
	
	public void buyApple(FruitSeller seller, int money) {
		this.numOfApple += seller.saleApple(money);	//구매한 사과의 수
		this.money -= money;						//사고 남은 돈
	}
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액: " + money);
		System.out.println("사과 개수: " + numOfApple);
	}
}
