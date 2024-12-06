package BinaryTrees;

import java.util.Stack;

public class LeetCode112PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		System.out.println(hasPathSum(root,7));

	}
	
	public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        Stack<TreeNode> nodeStack=new Stack<>();
        Stack<Integer> sumStack=new Stack<>();

        nodeStack.add(root);
        sumStack.add(targetSum-root.val);

        while(!nodeStack.isEmpty()){
            TreeNode currNode=nodeStack.pop();
            int currSum=sumStack.pop();

            if(currNode.left==null && currNode.right==null && currSum==0){
                return true;
            }

            if(currNode.left!=null){
                nodeStack.add(currNode.left);
                sumStack.add(currSum-currNode.left.val);
            }
            if(currNode.right!=null){
                nodeStack.add(currNode.right);
                sumStack.add(currSum-currNode.right.val);
            }
        }
        return false;
    }

}
