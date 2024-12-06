package BinarySearchTrees;

import java.util.Stack;

import BinaryTrees.TreeNode;

class BSTIterator {
    
    //reverse-> true means before()
    //reverse-> false means next()
    private Stack<TreeNode> st=new Stack<>();
    boolean reverse=true;
    public BSTIterator(BinaryTrees.TreeNode root,boolean isReverse) {
        reverse=isReverse;
        pushAll(root);
    }
    
    public int next() {
        TreeNode temp=st.pop();
        if(reverse==false)
            pushAll(temp.right);
        else
            pushAll(temp.left);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    public void pushAll(TreeNode root){
        
        while(root!=null){
            st.push(root);
            if(reverse==true){
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
    }
}