package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode145IterativePostOrderUsingTwoStack {

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
	
	static List<Integer> postorder(TreeNode root){
		Stack<TreeNode> st1=new Stack<>();
		Stack<TreeNode> st2=new Stack<>();
		
		List<Integer> postorder=new ArrayList<>();
		st1.push(root);
		
		while(!st1.isEmpty()) {
			root=st1.pop();
			st2.push(root);
			if(root.left!=null) {
				st1.push(root.left);
			}
			if(root.right!=null) {
				st1.push(root.right);
			}
		}
		while(!st2.isEmpty()) {
			postorder.add(st2.pop().val);
		}
		return postorder;
	}

}
