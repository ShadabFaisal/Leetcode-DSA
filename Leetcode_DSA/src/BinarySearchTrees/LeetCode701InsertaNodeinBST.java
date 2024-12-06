package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode701InsertaNodeinBST {

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
		
		TreeNode ans=insertIntoBST(root,9);
		inorder(ans);
		
	}

	static void inorder(TreeNode root) {
		if( root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.val+" ");
		inorder(root.right);
	}
	public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        
        TreeNode cur=root;
        while(true){
            if(cur.val<=val){
                if(cur.right!=null)cur=cur.right;
                else{
                    cur.right=new TreeNode(val);
                    break;
                }
            }
            else{
                if(cur.left!=null)cur=cur.left;
                else{
                    cur.left=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

}
