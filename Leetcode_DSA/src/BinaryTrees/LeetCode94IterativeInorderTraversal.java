package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94IterativeInorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<Integer> inorder=inorder(root);
		System.out.println(inorder);
	}
	public static List<Integer> inorder(TreeNode root){
		Stack<TreeNode> st=new Stack<TreeNode>();
		List<Integer> inorder=new ArrayList<Integer>();
		TreeNode node=root;
		
		while(true) {
			if(node!=null){
				st.push(node);
				node=node.left;
			}
			else {
				if(st.isEmpty()) {
					break;
				}
				node=st.pop();
				inorder.add(node.val);
				node=node.right;
			}
		}
		return inorder;
		
	}

}
