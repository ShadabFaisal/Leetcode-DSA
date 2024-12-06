package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeetCode199RightSideViewofBinaryTree {

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
		System.out.println(rightSideView(root));

	}
	public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        rightView(root,ans,0);
        return ans;
    }
    public static void rightView(TreeNode root,List<Integer> ans,int level){
        if(root==null)return;
        
        if(level==ans.size()){
            ans.add(root.val);
        }
        rightView(root.right,ans,level+1);
         rightView(root.left,ans,level+1);
    }

}
