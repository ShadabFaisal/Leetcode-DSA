package StackAndQueue;

import java.util.Stack;

public class LeetCode150EvaluateReversePolishNotation {

	public static void main(String[] args) {
		String[] tokens = { "10", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
		Stack<Integer> st = new Stack<>();

		for (String s : tokens) {

			if (isOperator(s)) {
				int b = st.pop();
				int a = st.pop();
				int ans = 0;
				if (s.equals("+")) {
					ans = a + b;
				} else if (s.equals("-")) {
					ans = a - b;
				} else if (s.equals("*")) {
					ans = a * b;
				} else if (s.equals("/")) {
					ans = a / b;
				}
				st.push(ans);
			}

			else {
				st.push(Integer.valueOf(s));
			}
		}
		return st.peek();
	}

	static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
			return true;
		}
		return false;
	}

}
