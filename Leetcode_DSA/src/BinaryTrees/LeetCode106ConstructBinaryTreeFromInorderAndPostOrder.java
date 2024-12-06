package BinaryTrees;

import java.util.HashMap;
import java.util.Map;

public class LeetCode106ConstructBinaryTreeFromInorderAndPostOrder {

	public static void main(String[] args) {
		int[] inorder = { 40, 20, 50, 10, 60, 30 };
		int[] postorder = { 40, 50, 20, 60, 30, 10 };
		TreeNode root = buildTree(inorder, postorder);
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

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; i++) {
			inMap.put(inorder[i], i);
		}
		return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inMap);
	}

	public static TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
			Map<Integer, Integer> inMap) {
		if (postStart > postEnd || inStart > inEnd)
			return null;

		TreeNode root = new TreeNode(postorder[postEnd]);
		int inRoot = inMap.get(root.val);
		int numLeft = inRoot - inStart;

		root.left = buildTree(inorder, inStart, inRoot - 1, postorder, postStart, postStart + numLeft - 1, inMap);
		root.right = buildTree(inorder, inRoot + 1, inEnd, postorder, postStart + numLeft, postEnd - 1, inMap);

		return root;
	}

}
