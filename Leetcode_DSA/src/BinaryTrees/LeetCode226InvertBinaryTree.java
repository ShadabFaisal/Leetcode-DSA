package BinaryTrees;

public class LeetCode226InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(9);
		
		TreeNode ans=invertTree(root);
		
		InorderTraversal.inorder(ans);
		
	}
	
	public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        //swap the nodes
        root.right=left;
        root.left=right;

        return root;
    }

}
