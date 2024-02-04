package ch09.resolve14.resolve2.manufacturer;

import ch09.resolve14.resolve2.ITablet;

public class Sony implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Sony - 영화 재생 성공");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Sony - 음악 재생 성공");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Sony - 독서 성공");
		Thread.sleep((long)(Math.random()*500)+500);
	}

}
