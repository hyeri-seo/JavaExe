package ch09.resolve14.resolve1;

public class PrinterMain {

	public static void main(String[] args) {
		InkjetPrinter inkjetPrinter = 
				new InkjetPrinter("G2910", "캐논", "USB", 1, 1000);
		LaserPrinter laserPrinter = 
				new LaserPrinter("SL-C513", "삼성전자", "USB", 10, 1);
		
		inkjetPrinter.print();
		inkjetPrinter.print();
		
		System.out.println();
		
		laserPrinter.print();
		laserPrinter.print();
	}

}
