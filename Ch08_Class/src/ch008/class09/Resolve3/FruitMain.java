package ch008.class09.Resolve3;

import ch008.class09.Resolve3.FruitBuyer;
import ch008.class09.Resolve3.FruitSeller;

//3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class FruitMain {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20);
		FruitBuyer buyer = new FruitBuyer(5000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		System.out.println();
		
		seller.saleApple(buyer, 5000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
