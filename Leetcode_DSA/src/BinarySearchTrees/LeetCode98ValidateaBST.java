package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode98ValidateaBST {

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
		System.out.println(isValidBST(root));
	}
	public static boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean isValidBST(TreeNode root,long minVal, long maxVal) {
     if(root==null)return true;
        if(root.val>=maxVal || root.val<=minVal){
            return false;
        }
        
        return isValidBST(root.left, minVal,root.val) && isValidBST(root.right,root.val,maxVal);
    }

}
