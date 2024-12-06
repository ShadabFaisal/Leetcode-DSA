package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LargestBSTinBinaryTree {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.right=new TreeNode(15);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(8);
		root.right.right=new TreeNode(7);
		
		System.out.println(largestBSTSubtree(root));
	}
	
	public static NodeValue largestBSTSubtreeHelper(TreeNode root) {
		if(root==null)
			return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
		
		NodeValue left=largestBSTSubtreeHelper(root.left);
		NodeValue right=largestBSTSubtreeHelper(root.right);
		
		if(left.maxNode<root.val && root.val<right.minNode) {
			return new NodeValue(Math.min(root.val, left.minNode),Math.max(root.val, right.maxNode), 1+left.maxSize+right.maxSize);
		}
		return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
	}
	
	public static int largestBSTSubtree(TreeNode root) {
		return largestBSTSubtreeHelper(root).maxSize;
	}

}
class NodeValue{
	int minNode,maxNode;
	int maxSize;
	
	public NodeValue(int minNode, int maxNode, int maxSize) {
		this.minNode = minNode;
		this.maxNode = maxNode;
		this.maxSize = maxSize;
	}
}
