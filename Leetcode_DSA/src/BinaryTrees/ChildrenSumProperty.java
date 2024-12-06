package BinaryTrees;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(7);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(30);
		changeTree(root);
	}

	static void changeTree(TreeNode root) {
		if(root==null)return;
		
		int child=0;
		if(root.left!=null) {
			child+=root.left.val;
		}
		if(root.right!=null) {
			child+=root.right.val;
		}
		if(child>=root.val) {
			root.val=child;
		}
		else {
			if(root.left!=null) {
				root.left.val=root.val;
			}
			else if(root.right!=null) {
				root.right.val=root.val;
			}
		}
		changeTree(root.left);
		changeTree(root.right);
		int tot=0;
		if(root.left!=null) {
			tot+=root.left.val;
		}
		if(root.right!=null) {
			tot+=root.right.val;
		}
		if(root.left!=null || root.right!=null)
			root.val=tot;	
	}

}
