package ch09.resolve14.resolve2;

import ch09.resolve14.resolve2.manufacturer.LG;
import ch09.resolve14.resolve2.manufacturer.Samsung;
import ch09.resolve14.resolve2.manufacturer.Sony;
import ch09.resolve14.resolve2.order.TabletTester;

public class TabletMain {

	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {
							new Samsung(),
							new Sony(),
							new LG()
		};
		int[] score = new int[tabletArr.length];
		
		for(int i=0; i<tabletArr.length; i++) {
			tabletTester.setTablet(tabletArr[i]);
			
			score[i] += tabletTester.movieTest();
			System.out.printf("---Movie 테스트 점수는 %d입니다\n", score[i]);
			score[i] += tabletTester.musicTest();
			System.out.printf("---Music 테스트 점수는 %d입니다\n", score[i]);
			score[i] += tabletTester.readBookTest();
			System.out.printf("---ReadBook 테스트 점수는 %d입니다\n", score[i]);
			score[i] += tabletTester.tabletTest();
			
			System.out.printf("===> 전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("---------------------------------");
		}
		
		int max = score[0];
		int maxIdx = 0;
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d입니다\n",
						maxIdx+1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}

}
