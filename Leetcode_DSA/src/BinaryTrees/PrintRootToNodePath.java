package BinaryTrees;

import java.util.ArrayList;

public class PrintRootToNodePath {

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
		System.out.println(solve(root,7));
	}
	public static ArrayList<Integer> solve(TreeNode root, int x){
		ArrayList<Integer> ans=new ArrayList<>();
		if(root==null) {
			return ans;
		}
		getPath(root, ans, x);
		return ans;
	}
	private static boolean getPath(TreeNode root, ArrayList<Integer> ans, int x) {
		if(root==null)return false;
		ans.add(root.val);
		if(root.val==x) {
			return true;
		}
		if(getPath(root.left,ans,x) || getPath(root.right,ans,x)) {
			return true;
		}
		ans.remove(ans.size()-1);
		return false;
	}

}
