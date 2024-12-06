package BinaryTrees;

import java.util.*;

public class MinimumTimeToBurnTreeFromaNode {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(7);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		System.out.println(timeToBurn(root, root.left));

	}

	public static void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			if (current.left != null) {
				parent_track.put(current.left, current);
				queue.offer(current.left);
			}
			if (current.right != null) {
				parent_track.put(current.right, current);
				queue.offer(current.right);
			}
		}
	}

	public static int timeToBurn(TreeNode root, TreeNode target) {
		Map<TreeNode, TreeNode> parent_track = new HashMap<TreeNode, TreeNode>();
		markParents(root, parent_track);
		Map<TreeNode, Integer> visited = new HashMap<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(target);
		visited.put(target, 1);
		int time = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			int flag = 0;
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.poll();
				if (current.left != null && visited.get(current.left) == null) {
					flag = 1;
					queue.offer(current.left);
					visited.put(current.left, flag);
				}
				if (current.right != null && visited.get(current.right) == null) {
					flag = 1;
					queue.offer(current.right);
					visited.put(current.right, flag);
				}
				if (parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
					flag = 1;
					queue.offer(parent_track.get(current));
					visited.put(parent_track.get(current), 1);
				}
			}
			if (flag == 1)
				time++;
		}
		return time;
	}

}
