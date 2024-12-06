package BinaryTrees;

import java.util.*;

public class LeetCode105ConstructBinaryTreeFromInorderAndPreorder {

	public static void main(String[] args) {
		int[] inorder = { 40, 20, 50, 10, 60, 30 };
		int[] preorder = { 10, 20, 40, 50, 30, 60 };
		TreeNode root = buildTree(preorder, inorder);
		inorder(root);
	}

	static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; i++) {
			inMap.put(inorder[i], i);
		}
		TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
		return root;

	}

	public static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> inMap) {
		if (preStart > preEnd || inStart > inEnd)
			return null;

		TreeNode root = new TreeNode(preorder[preStart]);
		int inRoot = inMap.get(root.val);
		int numLeft = inRoot - inStart;

		root.left = buildTree(preorder, preStart + 1, preStart + numLeft, inorder, inStart, inRoot - 1, inMap);
		root.right = buildTree(preorder, preStart + numLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

		return root;
	}

}
