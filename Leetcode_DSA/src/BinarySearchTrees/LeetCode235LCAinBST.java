package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode235LCAinBST {

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
		
		TreeNode lca=lowestCommonAncestor(root,root.left.right.left,root.right.right.left);
		System.out.println(lca.val);

	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	       if(root==null){
	           return null;
	       } 
	        int cur=root.val;
	        if(cur<p.val && cur<q.val){
	            return lowestCommonAncestor(root.right,p,q);
	        }
	         if(cur>p.val && cur>q.val){
	            return lowestCommonAncestor(root.left,p,q);
	        }
	        return root;
	    }

}
