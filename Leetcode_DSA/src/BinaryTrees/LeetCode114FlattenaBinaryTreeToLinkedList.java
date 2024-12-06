package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode114FlattenaBinaryTreeToLinkedList {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
		root.right.right.left = new TreeNode(7);
		flatten(root);
		List<Integer> ans = new ArrayList<>();
		while (root != null) {
			ans.add(root.val);
			root = root.right;
		}
		System.out.println(ans);
	}

	public static void flatten(TreeNode root) {

		if (root == null)
			return;
		TreeNode cur = root;
		while (cur != null) {
			if (cur.left != null) {
				TreeNode prev = cur.left;
				while (prev.right != null && prev.right != cur) {
					prev = prev.right;
				}
				prev.right = cur.right;
				cur.right = cur.left;
				cur.left = null;
			}
			cur = cur.right;
		}
	}

	public void flattenUsingStack(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		while (!st.isEmpty()) {
			TreeNode curr = st.pop();
			if (curr.right != null) {
				st.push(curr.right);
			}
			if (curr.left != null) {
				st.push(curr.left);
			}
			if (!st.isEmpty()) {
				curr.right = st.peek();
			}
			curr.left = null;
		}
	}

}
