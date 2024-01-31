package ch008.class09.Resolve1;

public class FruitSeller {
	private int numOfApple; // 사과개수
	private int saleMoney; // 판매금액
	final static int APPLE_PRICE = 1000; // 사과가격(상수)
	// 인터페이스에서 상수를 만들 때는 자동으로 final을 붙여줘서 쓸 필요가 없음

	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	
	public void saleApple(FruitBuyer buyer, int money) {
		FruitSeller seller = new FruitSeller(numOfApple);
		int num = buyer.buyApple(money);
		numOfApple -= num;
		saleMoney += money;
	}

	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + saleMoney);
	}
}
