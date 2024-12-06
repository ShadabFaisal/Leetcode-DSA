package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreInPostInOneTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		preInPost(root);
	}
	
	static void preInPost(TreeNode root) {
		Stack<Pair> st=new Stack<Pair>();
		st.push(new Pair(root,1));
		
		List<Integer> preorder=new ArrayList<>();
		List<Integer> inorder=new ArrayList<>();
		List<Integer> postorder=new ArrayList<>();
		
		while(!st.isEmpty()) {
			Pair it=st.pop();
			if(it.num==1) {
				preorder.add(it.node.val);
				it.num++;
				st.push(it);
				
				if(it.node.left!=null) {
					st.push(new Pair(it.node.left,1));
				}
			}
			else if(it.num==2) {
				inorder.add(it.node.val);
				it.num++;
				st.push(it);
				
				if(it.node.right!=null) {
					st.push(new Pair(it.node.right,1));
				}
			}
			else {
				postorder.add(it.node.val);
			}
		}
		System.out.println("Preorder -> "+preorder);
		System.out.println("Inorder -> "+inorder);
		System.out.println("Postorder -> "+postorder);
	}

}
