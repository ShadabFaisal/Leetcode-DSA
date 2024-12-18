package BinaryTrees;

public class LeetCode104MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		System.out.println(height(root));
	}

	private static int height(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		return 1+Math.max(left, right);
	}

}
