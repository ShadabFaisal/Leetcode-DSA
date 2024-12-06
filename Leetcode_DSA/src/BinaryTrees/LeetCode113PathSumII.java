package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113PathSumII {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		System.out.println(pathSum(root,7));

	}
	 public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> ans=new ArrayList<List<Integer>>();
	        
	        dfs(root,0,ans,new ArrayList<>(), targetSum);
	        
	        return ans;
	    }
	    public static void dfs(TreeNode root, int currSum, List<List<Integer>> ans, List<Integer> list,int target){
	        
	        if(root==null)return;
	        
	        list.add(root.val);
	        
	        if(root.left==null && root.right==null && target==(currSum+root.val)){
	            ans.add(new ArrayList<>(list));
	        }
	        
	        dfs(root.left,currSum+root.val,ans, new ArrayList<>(list),target);
	        dfs(root.right,currSum+root.val,ans, new ArrayList<>(list),target);
	        
	        
	        
	    }

}
