package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		//K는 Tv로 대체, M은 String으로 대체
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		//Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(product1);	//ch13.sec02.exam01.Product@1d81eb93
		System.out.println(tv);			//ch13.sec02.exam01.Tv@7291c18f
		System.out.println(tvModel);	//스마트Tv
		//-------------------------------------------------
		//K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<>();
		
		//Setter 매개값은 반드시 Car와 String을 제공
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		
		//Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(product2);	//ch13.sec02.exam01.Product@7cc355be
		System.out.println(car);		//ch13.sec02.exam01.Car@6e8cf4c6
		System.out.println(carModel);	//SUV 자동차
	}

}
