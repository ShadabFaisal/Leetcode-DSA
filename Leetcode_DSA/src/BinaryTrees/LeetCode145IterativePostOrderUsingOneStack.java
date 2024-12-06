package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode145IterativePostOrderUsingOneStack {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<Integer> postorder=postorder(root);
		System.out.println(postorder);

	}

	private static List<Integer> postorder(TreeNode root) {
		List<Integer> postorder=new ArrayList<Integer>();
		Stack<TreeNode> st=new Stack<>();
		if(root==null)return postorder;
		TreeNode cur=root;
		
		while(cur!=null || !st.isEmpty()) {
			if(cur!=null) {
				st.push(cur);
				cur=cur.left;
			}
			else {
				TreeNode temp=st.peek().right;
				if(temp==null) {
					temp=st.peek();
					st.pop();
					postorder.add(temp.val);
					while(!st.isEmpty() && temp==st.peek().right) {
						temp=st.peek();
						st.pop();
						postorder.add(temp.val);
					}
				}
				else {
					cur=temp;
				}
			}
		}
		return postorder;
	}

}
