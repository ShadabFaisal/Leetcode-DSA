package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode653TwoSumIVinBST {

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
		
		System.out.println(findTarget(root,7));

	}
	public static boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        BSTIterator l=new BSTIterator(root,false);
        BSTIterator r=new BSTIterator(root,true);
        int i=l.next();
        int j=r.next();
        
        while(i<j){
            if(i+j==k)return true;
            else if(i+j<k)
                i=l.next();
            else
                j=r.next();
        }
        return false;
    }

}


