package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<List<Integer>> levelorder=levelorder(root);
		System.out.println(levelorder);

	}
	static List<List<Integer>> levelorder(TreeNode root){
		List<List<Integer>> wrapList=new ArrayList<>();
		Queue<TreeNode> q=new LinkedList<>();
		if(root==null) {
			return wrapList;
		}
		
		q.offer(root);
		
		while(!q.isEmpty()) {
			int levelnum=q.size();
			List<Integer> subList=new ArrayList<>();
			for (int i = 0; i < levelnum; i++) {
				if(q.peek().left!=null) {
					q.offer(q.peek().left);
				}
				if(q.peek().right!=null) {
					q.offer(q.peek().right);
				}
				subList.add(q.poll().val);
			}
			wrapList.add(subList);
		}
		return wrapList;	
	}
}
