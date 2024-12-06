package BinaryTrees;

public class LeetCode100SameTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		
		System.out.println(isSameTree(root,node));

	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return (p==q);
        }
        return (p.val==q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
    }

}
