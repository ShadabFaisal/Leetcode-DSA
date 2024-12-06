package BinaryTrees;

public class BalancedTreeViolation {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(3);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(8);
		root.left.right=new TreeNode(9);
		System.out.println(violation(root));

	}
	
	public static int violation(TreeNode root) {
		int count=0;
		if(root==null)return 0;
		
		return count;
	}

}
