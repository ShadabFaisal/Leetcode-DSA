package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode99RecoverBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(2);
		inorderTraversal(root);
		recoverTree(root);
		System.out.println();
		inorderTraversal(root);
		
	}
	static void inorderTraversal(TreeNode root) {
		if( root==null) {
			return;
		}
		
		inorderTraversal(root.left);
		System.out.print(root.val+" ");
		inorderTraversal(root.right);
	}

	private static TreeNode first;
    private static TreeNode prev;
    private static TreeNode middle;
    private static TreeNode last;
    
    public static void inorder(TreeNode root){
        if(root==null)return;
        
        inorder(root.left);
        if(prev!=null && root.val< prev.val){
            if(first==null){
                first=prev;
                middle=root;
            }
            else{
                last=root;
            }
        }
        prev=root;
        inorder(root.right);
    }
    
    public static void recoverTree(TreeNode root) {
        first=middle=last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
        else if(first!=null && middle!=null){
             int t=first.val;
            first.val=middle.val;
            middle.val=t;
        }
    }
}
