package BinaryTrees;

import java.util.ArrayList;

public class LeetCode545BoundaryTraversalinBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		System.out.println(traverseBoundary(root));
	}
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		ArrayList<Integer> res=new ArrayList<>();
        if(isLeaf(root)==false){
            res.add(root.val);
        }
        addLeftBoundary(root,res);
        addLeaves(root,res);
        addRightBoundary(root,res);
        return res;
	}
	static boolean isLeaf(TreeNode root){
        return (root.left==null) && (root.right==null);
    }

    static void addLeftBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode cur=root.left;
        while(cur!=null){
            if(isLeaf(cur)==false){
                res.add(cur.val);
            }
            if(cur.left!=null){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
    }
    static void addLeaves(TreeNode root, ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.val);
            return;
        }
        if(root.left!=null)
            addLeaves(root.left,res);
        if(root.right!=null)
            addLeaves(root.right,res);
    }
   static void addRightBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode cur=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(cur!=null){
            if(isLeaf(cur)==false){
                temp.add(cur.val);
            }
            if(cur.right!=null){
                cur=cur.right;    
                }
                else{
                    cur=cur.left;
                }
        }
            for(int i=temp.size()-1;i>=0;--i){
                res.add(temp.get(i));
            }
        }
    
}
