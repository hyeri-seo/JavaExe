package ch09.resolve14.resolve3;

import java.util.Scanner;

public class DecisionBall {
	
	protected static Scanner sc;
	protected static int strikeCount;
	protected static int ballCount;
	
	public DecisionBall() {}
	
	protected static void decisionBall(Scanner sc, int[] nums, int[] inputs) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<inputs.length; j++) {
				if(i==j && nums[i] == inputs[j]) {
					strikeCount++;
				} else if(i!=j && nums[i] == inputs[j]) {
					ballCount++;
				}
			}
		}
		System.out.printf("==> %d스트라이크 %d볼", strikeCount, ballCount);
		if(strikeCount == 3) {
			System.out.println("==> 삼진아웃!!");
		}
	}	
}
