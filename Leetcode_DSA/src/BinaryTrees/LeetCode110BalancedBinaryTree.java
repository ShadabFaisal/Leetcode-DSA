package BinaryTrees;

public class LeetCode110BalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.left.left=new TreeNode(10);
		root.right.right=new TreeNode(7);
		root.right.right.left=new TreeNode(8);
		System.out.println(isBalanced(root));
	}
	
	 public static  boolean isBalanced(TreeNode root) {
	        return check(root)!=-1;
	    }
	    static int check(TreeNode root){
	        if(root==null)return 0;
	        
	        int lh=check(root.left);
	        int rh=check(root.right);
	        
	        if(lh==-1 || rh==-1)return -1;
	        if(Math.abs(lh-rh)>1)return -1;
	        
	        return 1+Math.max(lh,rh);
	    }

}
