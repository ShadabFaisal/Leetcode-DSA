package Searching;

public class LeetCode69SqrtX {

	public static void main(String[] args) {
		int n = 28;
		System.out.println(mySqrtBS(n));

	}

	// Brute-force
	public int mySqrt(int x) {
		if (x == 0)
			return 0;
		int ans = 1;
		for (int i = 1; i <= x; i++) {
			if (i * i <= x) {
				ans = i;
			} else {
				break;
			}
		}
		return ans;
	}

	// Binary Search

	public static int mySqrtBS(int x) {
		if (x == 0) {
			return 0;
		}
		int start = 1;
		int end = x;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// instead of mid*mid we are giving x/mid to tackle overflow of integer range
			// when multiplying with bigger numbers
			if (mid <= x / mid) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return end;
	}

}
