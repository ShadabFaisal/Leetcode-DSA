package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeetCode144MorrisPreorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<Integer> preorder=preorderTraversal(root);
		System.out.println(preorder);
	}
	public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                preorder.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode prev=cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=cur;
                    preorder.add(cur.val);
                    cur=cur.left;
                }
                else{
                    prev.right=null;
                    
                    cur=cur.right;
                }
            }
        }
        return preorder;
    }
	

}
