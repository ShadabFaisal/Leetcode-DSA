package BinaryTrees;

public class LeetCode124MaximumPathSumOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(maxPathSum(root));
	}

	public static int maxPathSum(TreeNode root) {
		int[] maxValue = new int[1];
		maxValue[0] = Integer.MIN_VALUE;
		maxPathDown(root, maxValue);
		return maxValue[0];
	}

	static int maxPathDown(TreeNode root, int[] maxValue) {
		if (root == null)
			return 0;

		int left = Math.max(0, maxPathDown(root.left, maxValue));
		int right = Math.max(0, maxPathDown(root.right, maxValue));

		maxValue[0] = Math.max(maxValue[0], left + right + root.val);
		return Math.max(left, right) + root.val;
	}

}
