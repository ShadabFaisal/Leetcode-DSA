package BinaryTrees;

public class LeetCode222CountCompleteTreeNodes {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		System.out.println(countNodes(root));

	}
	
	public static int countNodes(TreeNode root) {
	       if(root==null)return 0;

	       int left=getLeftHeight(root);
	       int right=getRightHeight(root);

	       if(left==right)return (2<<(left))-1;
	       else{
	           return 1+countNodes(root.left)+countNodes(root.right);
	       } 
	    }

	    public static int getLeftHeight(TreeNode root){
	        int count=0;
	        while(root.left!=null){
	            count++;
	            root=root.left;
	        }
	        return count;
	    }

	     public static int getRightHeight(TreeNode root){
	        int count=0;
	        while(root.right!=null){
	            count++;
	            root=root.right;
	        }
	        return count;
	    }

}
