package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode1200MinimumAbsoluteDifferenceinBST {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		
		System.out.println(getMinimumDifference(root));
	}
	
	static Integer prev;
    static int res=Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root) {
        prev=null;
        inorder(root);
        return res;
    }
    public static void inorder(TreeNode root){
        if(root==null)return;

        inorder(root.left);
        if(prev!=null){
            res=Math.min(res,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }

}
