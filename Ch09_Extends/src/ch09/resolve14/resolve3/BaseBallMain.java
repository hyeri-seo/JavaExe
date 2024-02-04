package ch09.resolve14.resolve3;

import java.util.Scanner;

public class BaseBallMain {
	protected static boolean isRun;

	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			
			int[] nums = GeneratorThreeNum.makeThreeNums();
			
			System.out.print(BaseBallMenu.input0);
			int input0 = sc.nextInt();
			System.out.print(BaseBallMenu.input1);
			int input1 = sc.nextInt();
			System.out.print(BaseBallMenu.input2);
			int input2 = sc.nextInt();
			int[] inputs = {input0, input1, input2};
			
			DecisionBall.decisionBall(sc, nums, inputs);
			
			System.out.println();
			
			System.out.print(BaseBallMenu.keepGoing);
			String res = sc.next();
			switch(res) {
			case "Y", "y":
				isRun = true;
				break;
			case "N", "n":
				break;
			}
			
		} while(isRun);
	}
}
