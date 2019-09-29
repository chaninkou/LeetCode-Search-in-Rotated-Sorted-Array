package findTarget;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {6,7,0,1,2,3,4};
		
		int target = 2;
		
		System.out.println("Nums: " + Arrays.toString(nums) + " target: " + target);
		
		FindTargetFromRotatedSortedArrayFunction solution = new FindTargetFromRotatedSortedArrayFunction();
		
		System.out.println("Target is at Index: " + solution.search(nums, target));
	}
}
