package ch09.resolve14.resolve3;

public class GeneratorThreeNum {
	
	protected static int[] makeThreeNums() {
		int[] nums = new int[3];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(nums[i] == nums[j]) i--;
			}
		}
		return nums;
	}
}
