package ch008.class11;

/*
 * 함수의 오버로딩(Overloading)
 * : Java는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 * 	 실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에
 */

public class WatchTime {
	private int hour, min, sec;

	public WatchTime(int hour, int min, int sec) {
		System.out.println("this:" + this);
		// this:ch008.class11.WatchTime@2f4d3709 (wtNum이랑 같음)
		// this:ch008.class11.WatchTime@7530d0a (wtNum1이랑 같음)
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	//public vid viewTime(WatchTime this)
	public void viewTime() {
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum:" + wtNum); // wtNum:ch008.class11.WatchTime@2f4d3709 (this랑 똑같음)
		System.out.printf("wtNum:%s\n", wtNum.hashCode()); // wtNum:793589513
		wtNum.viewTime();	//viewTime(wtNum);

		WatchTime wtNum1 = new WatchTime(13, 123, 53);
		System.out.println("wtNum1:" + wtNum1); // wtNum1:ch008.class11.WatchTime@7530d0a
		System.out.printf("wtNum1:%s\n", wtNum1.hashCode()); // wtNum1:ch008.class11.WatchTime@7530d0a
		wtNum1.viewTime();	//viewTime(wtNum1);
	}
}