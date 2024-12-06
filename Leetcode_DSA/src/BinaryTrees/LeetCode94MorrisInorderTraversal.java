package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94MorrisInorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<Integer> inorder=inorderTraversal(root);
		System.out.println(inorder);
	}
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                inorder.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode prev=cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=cur;
                    cur=cur.left;
                }
                else{
                    prev.right=null;
                    inorder.add(cur.val);
                    cur=cur.right;
                }
            }
        }
        return inorder;
    }

}
