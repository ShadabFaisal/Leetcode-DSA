package BinaryTrees;

public class LeetCode1457PseudoPalindromicPathsinBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(1);
		root.right.right = new TreeNode(1);
		System.out.println(pseudoPalindromicPaths(root));
	}

	static int result = 0;
	static int[] digits;

	public static int pseudoPalindromicPaths(TreeNode root) {
		digits = new int[10];
		dfs(root);
		return result;
	}

	public static void dfs(TreeNode root) {
		if (root == null)
			return;

		digits[root.val]++;
		if (root.left == null && root.right == null) {
			if (isPalindrome()) {
				result++;
			}
		} else {
			dfs(root.left);
			dfs(root.right);
		}
		digits[root.val]--;
	}

	static boolean isPalindrome() {
		int odd = 0;
		for (int i = 1; i <= 9; i++) {
			if (digits[i] % 2 != 0) {
				odd++;
			}
		}
		if (odd > 1) {
			return false;
		}
		return true;
	}

}
