package Arrays;

import java.util.HashMap;

public class LeetCode523ContinuousSubarraySum {

	public static void main(String[] args) {
		int[] arr = { 23, 2, 4, 6, 7 };
		System.out.println(checkSubarraySum2(arr, 2));

	}

	// Brute-Force TLE
	public static boolean checkSubarraySum(int[] nums, int k) {
		int n = nums.length;

		int[] dp = new int[n];
		dp[0] = nums[0];

		for (int i = 1; i < n; i++) {
			dp[i] = nums[i] + dp[i - 1];

			if (nums[i] == 0 && nums[i - 1] == 0)
				return true;
			if (dp[i] % k == 0)
				return true;
		}
		if (dp[n - 1] < k)
			return false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 2; j < n; j++) {
				if (dp[j] - dp[i] % k == 0)
					return true;
			}
		}
		return false;
	}

	public static boolean checkSubarraySum2(int[] nums, int k) {
		int n = nums.length;

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 0);

		int sum = 0;

		for (int i = 0; i < n; i++) {

			sum += nums[i];

			if (!map.containsKey(sum % k)) {
				map.put(sum % k, i + 1);
			}

			// if (sum%k) is repeating itself, it means there are other values whose sum
			// will be divisible by k
			else {
				if (map.get(sum % k) < i) {
					return true;
				}
			}

		}

		return false;
	}

}
