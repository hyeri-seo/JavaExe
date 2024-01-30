package ch008.class08;

public class FruitSeller {
	private int numOfapple;			//사과개수
	private int saleMoney;			//판매금액
	final int APPLE_PRICE = 1000;	//사과가격(상수)
	//인터페이스에서 상수를 만들 때는 자동으로 final을 붙여줘서 쓸 필요가 없음
	
	public FruitSeller(int numOfApple) {
		this.numOfapple = numOfApple;
	}
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;	//소비자가 구매한 사과의 개수
		numOfapple -= num;				//팔고 남은 사과의 개수
		saleMoney += money;				//번 돈
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과: " + numOfapple);
		System.out.println("판매 수익: " + saleMoney);
	}
}
