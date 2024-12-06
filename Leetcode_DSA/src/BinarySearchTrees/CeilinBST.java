package BinarySearchTrees;

public class CeilinBST {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(8);
		root.left=new TreeNode(5);
		root.right=new TreeNode(12);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(7);
		root.left.right.left=new TreeNode(6);
		root.right.left=new TreeNode(10);
		root.right.right=new TreeNode(14);
		root.right.right.left=new TreeNode(13);
		System.out.println(ceilBST(root,9));

	}
	public static int ceilBST(TreeNode root, int key) {
		int ceil=-1;
		while(root!=null) {
			if(root.val==key) {
				ceil=root.val;
				return ceil;
			}
			if(key<root.val) {
				ceil=root.val;
				root=root.left;
			}
			else {
				root=root.right;
			}
		}
		return ceil;
	}

}
