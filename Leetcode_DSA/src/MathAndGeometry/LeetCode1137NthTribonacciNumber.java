package MathAndGeometry;

public class LeetCode1137NthTribonacciNumber {

	public static void main(String[] args) {
		System.out.println(tribonacci(4));
	}

	// The Tribonacci sequence Tn is defined as follows:

	// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

	// Given n, return the value of Tn.

	public static int tribonacci(int n) {
		if (n == 0)
			return 0;
		else if (n <= 2)
			return 1;
		else {
			int a = 0, b = 1, c = 1;
			int index = 3;
			int sum = 0;

			while (index <= n) {
				sum = a + b + c;
				index++;
				a = b;
				b = c;
				c = sum;
			}
			return sum;
		}

	}

}
