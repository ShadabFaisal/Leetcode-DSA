package Numbers;

public class LeetCode1680ConcatenationofConsecutiveBinaryNumbers {

	public static void main(String[] args) {
		System.out.println(concatenatedBinary(3));
		System.out.println(concatenatedBinaryOp(4));
	}

	// Brute-Force
	public static int concatenatedBinary(int n) {
		long res = 0;
		int mod = 1000000007;
		for (int i = 1; i <= n; i++) {
			String binary = Integer.toBinaryString(i);
			res = (res << binary.length()) % mod;
			res = (res + i) % mod;
		}
		return (int) res;
	}

	public static int concatenatedBinaryOp(int n) {
		long res = 0;
		int mod = 1000000007;
		int size = 0;
		for (int i = 1; i <= n; i++) {
			if ((i & (i - 1)) == 0)
				size++;
			res = (res << size | i) % mod;
		}
		return (int) res;
	}

}
