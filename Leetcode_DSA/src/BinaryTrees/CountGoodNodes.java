package BinaryTrees;

public class CountGoodNodes {
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.left.left=new TreeNode(3);
		root.right.left=new TreeNode(1);
		root.right.right=new TreeNode(5);
		
		System.out.println(goodNodes(root));
		
	}
	 public static int goodNodes(TreeNode root) {
	        return helper(root, Integer.MIN_VALUE);
	        
	    }
	    public static int helper(TreeNode root, int max){
	        if(root==null){
	            return 0;
	        }
	        int ans=0;
	        if(root.val>=max){
	            ans++;
	            max=root.val;
	        }
	        return ans+helper(root.left, max)+helper(root.right,max);
	    }

}
