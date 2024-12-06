package BinaryTrees;

public class LeetCode236LowestCommonAncestorinBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(8);
		root.left.right.right = new TreeNode(9);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(lowestCommonAncestor(root, root.left.left, root.left.right).val);

	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null)return right;
        else if(right==null)return left;
        else return root;
        
    }

}
