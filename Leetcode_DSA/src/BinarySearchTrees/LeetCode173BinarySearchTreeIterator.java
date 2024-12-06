package BinarySearchTrees;

import java.util.Stack;

import BinaryTrees.TreeNode;

public class LeetCode173BinarySearchTreeIterator {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(5);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(7);
		root.left.right.left = new TreeNode(6);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(14);
		root.right.right.left = new TreeNode(13);
		
		LeetCode173BinarySearchTreeIterator sb=new LeetCode173BinarySearchTreeIterator(root);
		System.out.println(sb.hasNext());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.next());
		System.out.println(sb.hasNext());
	}
	 Stack<TreeNode> st=new Stack<>();
	    public LeetCode173BinarySearchTreeIterator(TreeNode root) {
	        pushAll(root);
	    }
	    
	    public int next() {
	        TreeNode temp=st.pop();
	        pushAll(temp.right);
	        return temp.val;
	    }
	    
	    public boolean hasNext() {
	        return !st.isEmpty();
	    }
	    public void pushAll(TreeNode root){
	        for(;root!=null;st.push(root),root=root.left);
	    }

}
