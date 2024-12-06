package BinarySearchTrees;

public class LeetCode1008ConstructaBSTfromPreorderTraversal {

	public static void main(String[] args) {
		int[] preorder= {8,5,1,7,10,12};
		TreeNode root=bstFromPreorder(preorder);
		inorder(root);
	}
	static void inorder(TreeNode root) {
		if(root==null)return;
		
		inorder(root.left);
		System.out.print(root.val+" ");
		inorder(root.right);
	}
	public static TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public static TreeNode bstFromPreorder(int[] preorder,int ub, int[] a){
        if(a[0]==preorder.length || preorder[a[0]]>ub){
            return null;
        }
        TreeNode root=new TreeNode(preorder[a[0]++]);
        root.left=bstFromPreorder(preorder,root.val,a);
        root.right=bstFromPreorder(preorder,ub,a);
        return root;
    }

}
