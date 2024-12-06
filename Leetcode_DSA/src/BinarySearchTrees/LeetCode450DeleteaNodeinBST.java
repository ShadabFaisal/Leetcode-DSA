package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode450DeleteaNodeinBST {

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
		TreeNode ans=deleteNode(root,12);
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
	public static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key)return helper(root);
        TreeNode dummy=root;
        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }
                else{
                    root=root.left;
                }
            }
            else{
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }
                else{
                    root=root.right;
                }
            }
        }
        return dummy;
    }
    public static TreeNode helper(TreeNode root){
        if(root.left==null)return root.right;
        else if(root.right==null)return root.left;
        else 
        {
            TreeNode rightChild=root.right;
            TreeNode lastRight=findLastRight(root.left);
            lastRight.right=rightChild;
        return root.left;
        }
    }
    public static TreeNode findLastRight(TreeNode root){
        if(root.right==null)
            return root;
        
        return findLastRight(root.right);
    }

}
