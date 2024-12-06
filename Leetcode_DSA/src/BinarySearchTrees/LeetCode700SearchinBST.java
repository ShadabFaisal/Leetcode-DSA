package BinarySearchTrees;

public class LeetCode700SearchinBST {

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
		
		TreeNode ans=searchBST(root,10);
		System.out.println(ans.val);

	}
	public static TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && root.val!=val){
            root=val<root.val?root.left:root.right;
        }
        return root;
    }

}
