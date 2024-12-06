package BinaryTrees;

public class LeetCode129SumRootToLeafNumbers {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		System.out.println(sumNumbers(root));
	}
	
	private static int totalSum=0;
    public static int sumNumbers(TreeNode root) {
        sumNumbers(root,0);
        return totalSum;
    }

    public static void sumNumbers(TreeNode root, int val){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            totalSum+=val*10+root.val;
            return;
        }
        sumNumbers(root.left,val*10+root.val);
        sumNumbers(root.right,val*10+root.val);

    }

}
