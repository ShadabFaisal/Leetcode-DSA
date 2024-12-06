package Arrays;

public class LeetCode1480RunningSumOrPrefixSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] result=runningSum(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	public static int[] runningSum(int[] nums) {

		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i];
		}

		return sum;

	}

}
