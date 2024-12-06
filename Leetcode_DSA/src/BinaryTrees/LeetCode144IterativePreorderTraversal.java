package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode144IterativePreorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<Integer> preorder=preorder(root);
		System.out.println(preorder);
	}
	
	static List<Integer> preorder(TreeNode root){
		Stack<TreeNode> st=new Stack<TreeNode>();
		List<Integer> preorder=new ArrayList<>();
		
		if(root==null)
			return preorder;
		
		st.push(root);
		while(!st.isEmpty()) {
			root=st.pop();
			preorder.add(root.val);
			if(root.right!=null) {
				st.push(root.right);
			}
			if(root.left!=null) {
				st.push(root.left);
			}
		}
		return preorder;
	}
}
