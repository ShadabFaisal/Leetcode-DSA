package BinaryTrees;

public class PostorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		postorder(root);
	}
	static void postorder(TreeNode root) {
		if( root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val+" ");
	}
}
