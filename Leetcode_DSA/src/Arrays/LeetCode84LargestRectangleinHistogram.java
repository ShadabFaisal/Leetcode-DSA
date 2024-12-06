package Arrays;

import java.util.Stack;

public class LeetCode84LargestRectangleinHistogram {

	public static void main(String[] args) {
		int[] heights = { 2, 1, 5, 6, 2, 3, 1 };
		System.out.println(largestRectangleArea(heights));

	}

	// Brute-Force TLE
	public static int largestRectangleArea(int[] heights) {
		int n = heights.length;

		int maxArea = 0;

		for (int i = 0; i < n; i++) {
			int minHeight = Integer.MAX_VALUE;
			for (int j = i; j < n; j++) {
				minHeight = Math.min(minHeight, heights[j]);
				maxArea = Math.max(maxArea, minHeight * (j - i + 1));
			}
		}
		return maxArea;
	}

	// Optimal
	public int largestRectangleAreaOp(int[] heights) {
		int n = heights.length;
		int maxArea = 0;
		Stack<Integer> st = new Stack<>();
		int[] leftSmall = new int[n];
		int[] rightSmall = new int[n];

		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
				st.pop();
			}
			if (st.isEmpty())
				leftSmall[i] = 0;
			else
				leftSmall[i] = st.peek() + 1;

			st.push(i);
		}

		while (!st.isEmpty())
			st.pop();// clear the stack to reuse it

		for (int i = n - 1; i >= 0; i--) {
			while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
				st.pop();
			}
			if (st.isEmpty())
				rightSmall[i] = n - 1;
			else
				rightSmall[i] = st.peek() - 1;
			maxArea = Math.max(maxArea, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
			st.push(i);
		}
		return maxArea;
	}

	// Optimised O(n) + O(n) Approach

	public int largestRectangleAreaOp2(int[] heights) {
		int n = heights.length;
		int maxArea = 0;
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i <= n; i++) {
			while (!st.isEmpty() && (i == n || heights[st.peek()] >= heights[i])) {
				int height = heights[st.peek()];
				st.pop();
				int width;
				if (st.isEmpty())
					width = i;
				else
					width = i - st.peek() - 1;
				maxArea = Math.max(maxArea, height * width);
			}
			st.push(i);
		}
		return maxArea;
	}

}
