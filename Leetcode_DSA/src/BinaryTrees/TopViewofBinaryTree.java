package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewofBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(getTopView(root));

	}
	public static ArrayList<Integer> getTopView(TreeNode root) {
		ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        
       Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair it= q.remove();
            int x=it.num;
            TreeNode temp=it.node;
            
            if(map.get(x)==null)
                map.put(x, temp.val);
            if(temp.left!=null){
                q.add(new Pair(temp.left,x-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,x+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
	}

}
