package Arrays;

public class LeetCode169MajorityElement {

	public static void main(String[] args) {
		
		int[] nums= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		int majElement=majorityElement(nums);
		System.out.print(majElement);
		
	}

	// Approach 1: Moore Voting Algorithm

	public static int majorityElement(int[] nums) {

		int count = 0;
		int element = 0;

		for (int num : nums) {
			if (count == 0) {
				element = num;
			}
			if (element == num) {
				count += 1;
			} else {
				count -= 1;
			}
		}
		return element;

	}

}
