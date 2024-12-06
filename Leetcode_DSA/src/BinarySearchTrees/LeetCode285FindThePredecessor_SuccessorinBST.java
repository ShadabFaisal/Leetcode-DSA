package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode285FindThePredecessor_SuccessorinBST {

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
		
		TreeNode successor=inorderSuccessor(root,root.right.right.left);
		System.out.println(successor.val);
		
		TreeNode predecessor=inorderPredecessor(root,root.right.right.left);
		System.out.println(predecessor.val);
		

	}
	public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		TreeNode successor=null;
		
		while(root!=null) {
			if(p.val>=root.val) {
				root=root.right;
			}
			else {
				successor=root;
				root=root.left;
			}
		}
		return successor;
	}
	public static TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
		TreeNode predecessor=null;
		
		while(root!=null) {
			if(p.val>root.val) {
				predecessor=root;
				root=root.right;
			}
			else {
				root=root.left;
			}
		}
		return predecessor;
	}
	

}
