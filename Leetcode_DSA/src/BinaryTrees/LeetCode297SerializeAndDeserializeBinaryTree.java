package BinaryTrees;

import java.util.*;

public class LeetCode297SerializeAndDeserializeBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(7);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		String serial = serialize(root);
		System.out.println(serial);
		TreeNode deserial = deserialize(serial);
		inorder(deserial);

	}

	static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {
		if (root == null)
			return "";

		Queue<TreeNode> q = new LinkedList<>();
		StringBuilder res = new StringBuilder();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node == null) {
				res.append("# ");
				continue;
			}
			res.append(node.val + " ");
			q.add(node.left);
			q.add(node.right);
		}
		return res.toString();
	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {
		if (data == "")
			return null;

		Queue<TreeNode> q = new LinkedList<>();
		String[] values = data.split(" ");
		TreeNode root = new TreeNode(Integer.parseInt(values[0]));

		q.add(root);
		for (int i = 1; i < values.length; i++) {
			TreeNode parent = q.poll();
			if (!values[i].equals("#")) {
				TreeNode left = new TreeNode(Integer.parseInt(values[i]));
				parent.left = left;
				q.add(left);
			}
			if (!values[++i].equals("#")) {
				TreeNode right = new TreeNode(Integer.parseInt(values[i]));
				parent.right = right;
				q.add(right);
			}
		}
		return root;

	}

}
