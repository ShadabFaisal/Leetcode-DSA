package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class LeetCode230KthSmallest_LargestElementinBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(5);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(7);
		root.left.right.left = new TreeNode(6);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(14);
		root.right.right.left = new TreeNode(13);
		
		System.out.println(kthSmallest(root,3));
		System.out.println(kthLargest(root,3));
		
	}
	static int ans=-1;
    static int count=0;
    static int answer=-1;
    static int cnt=0;
    
    public static void inorder(TreeNode root, int k){
        if(root==null)return;
        inorder(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
        }
      inorder(root.right,k);
    }
    public static int kthSmallest(TreeNode root, int k) {

        inorder(root,k);
        return ans;
    }
    public static int kthLargest(TreeNode root, int k) {

        reverseinorder(root,k);
        return answer;
    }
    public static void reverseinorder(TreeNode root, int k){
        if(root==null)return;
        reverseinorder(root.right,k);
        cnt++;
        if(cnt==k){
            answer=root.val;
        }
      reverseinorder(root.left,k);
    }
    

}
