package ch09.resolve14.resolve2.order;

import ch09.resolve14.resolve2.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;
	
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public TabletTester() {}
	
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public int movieTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			tablet.movie();
		}
		return (int)(Math.random()*50) + 50;
	}
	
	public int musicTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			tablet.music();
		}
		return (int)(Math.random()*50) + 50;
	}
	
	public int readBookTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			tablet.readBook();
		}
		return (int)(Math.random()*50) + 50;
	}
	
	public int tabletTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			tablet.movie();
			tablet.music();
			tablet.readBook();
		}
		return (int)(Math.random()*50) + 50;
	}
}
