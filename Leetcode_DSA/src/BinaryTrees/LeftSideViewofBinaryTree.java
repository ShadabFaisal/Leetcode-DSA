package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeftSideViewofBinaryTree {

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
		System.out.println(leftSideView(root));

	}public static List<Integer> leftSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        leftView(root,ans,0);
        return ans;
    }
    public static void leftView(TreeNode root,List<Integer> ans,int level){
        if(root==null)return;
        
        if(level==ans.size()){
            ans.add(root.val);
        }
        leftView(root.left,ans,level+1);
        leftView(root.right,ans,level+1);
         
    }

}
