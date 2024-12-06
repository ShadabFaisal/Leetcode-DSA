package BinaryTrees;

import java.util.*;

public class LeetCode863PrintAllNodesAtaDistanceK {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		int k = 2;
		List<Integer> ans = distanceK(root, root.left, k);
		System.out.println(ans);

	}

	public static void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track, TreeNode target) {
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

	public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

		Map<TreeNode, TreeNode> parent_track = new HashMap<>();
		markParents(root, parent_track, root);
		Map<TreeNode, Boolean> visited = new HashMap<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(target);
		visited.put(target, true);
		int curr_level = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			if (curr_level == k)
				break;
			curr_level++;
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.poll();
				if (current.left != null && visited.get(current.left) == null) {
					queue.offer(current.left);
					visited.put(current.left, true);
				}
				if (current.right != null && visited.get(current.right) == null) {
					queue.offer(current.right);
					visited.put(current.right, true);
				}
				if (parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
					queue.offer(parent_track.get(current));
					visited.put(parent_track.get(current), true);
				}
			}
		}
		List<Integer> ans = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			ans.add(curr.val);
		}
		return ans;
	}

}
