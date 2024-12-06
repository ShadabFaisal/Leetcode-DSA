package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode103ZigZagOrSpiralLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(zigzagLevelOrder(root));
		
	}
	public static  List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        boolean leftToRight=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> row=new ArrayList<>();
            for(int i=0;i<size;i++){
            	TreeNode curr=queue.peek();
            	System.out.println(curr.val);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                 if(curr.right!=null){
                    queue.offer(curr.right);
                }
                if(leftToRight==true)
                    row.add(queue.poll().val);
                else{
                   row.add(0,queue.poll().val); 
                }
            }
            leftToRight=!(leftToRight);
            result.add(row);
        }
        return result;
    }

}
