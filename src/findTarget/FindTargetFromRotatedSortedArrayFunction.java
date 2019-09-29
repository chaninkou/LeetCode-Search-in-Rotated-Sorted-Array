package findTarget;

public class FindTargetFromRotatedSortedArrayFunction {
	public int search(int[] nums, int target) {
		// First, check if the array is empty or null
		if (nums.length == 0 || nums == null) {
			return -1;
		}

		// Setting up start from 0 to the end
		int left = 0;
		int right = nums.length - 1;

		// We want <= because the target might be on the border line of left or
		// right
		while (left <= right) {
			// Getting the mid point in order to see if target is on left
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			// If mid point is bigger than left side or pivot is on the right
			if (nums[left] <= nums[mid]) {
				// Checking if the target is on the left side
				if (nums[left] <= target && target < nums[mid]) {
					// Drop right side if target is on left
					right = mid - 1;
				} else {
					// Drop left side if target is on right
					left = mid + 1;
				}
			} else { // if mid point is bigger than right side or pivot is on
						// the left
				if (nums[mid] < target && target <= nums[right]) {
					// Drop left side if target is on right
					left = mid + 1;
				} else {
					// Drop right side if target is on left
					right = mid - 1;
				}
			}

		}

		return -1;
	}
}
