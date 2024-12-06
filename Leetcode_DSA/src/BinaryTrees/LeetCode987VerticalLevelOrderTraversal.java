package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class LeetCode987VerticalLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		System.out.println(verticalTraversal(root));

	}
	public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node= tuple.node;
            int x=tuple.row;
            int y=tuple.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<Integer>());
            }
            map.get(x).get(y).offer(node.val);
            
            if(node.left!=null){
                q.offer(new Tuple(node.left,x-1,y+1));
            }
             if(node.right!=null){
                q.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys: map.values() ){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: ys.values()){
                while(!nodes.isEmpty()){
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }
        return list;
	}
}
