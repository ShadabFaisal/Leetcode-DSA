package Numbers;

public class LeetCode509FibonacciNumber {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fib(n));
		System.out.println(fibo(n));
		System.out.println(fibonacci(n));
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}

		int prev2 = 0;
		int prev = 1;
		for (int i = 2; i <= n; i++) {
			int curi = prev + prev2;
			prev2 = prev;
			prev = curi;
		}
		return prev;
	}

	public static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fib(n - 2) + fib(n - 1);
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
