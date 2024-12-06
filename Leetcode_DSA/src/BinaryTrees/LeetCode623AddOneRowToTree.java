package BinaryTrees;

public class LeetCode623AddOneRowToTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(1);
		root.right.right = new TreeNode(1);
		TreeNode cur = addOneRow(root, 5, 3);
		inorder(cur);
	}

	static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static TreeNode addOneRow(TreeNode root, int val, int depth) {
		return addRow(root, val, depth, 1);
	}

	public static TreeNode addRow(TreeNode root, int val, int depth, int level) {

		if (root == null) {
			return null;
		}
		if (depth == 1) {
			TreeNode node = new TreeNode(val);
			node.left = root;
			return node;
		}
		if (level == depth - 1) {
			TreeNode newNode = new TreeNode(val);
			newNode.left = root.left;
			root.left = newNode;

			newNode = new TreeNode(val);
			newNode.right = root.right;
			root.right = newNode;
		} else {
			addRow(root.left, val, depth, level + 1);
			addRow(root.right, val, depth, level + 1);
		}
		return root;
	}
}
