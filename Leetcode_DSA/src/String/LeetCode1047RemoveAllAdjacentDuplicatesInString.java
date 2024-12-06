package String;

import java.util.Stack;

public class LeetCode1047RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {

		String s="abbaca";
		System.out.println(removeDuplicates(s));
				
	}
	 public static String removeDuplicates(String s) {
	        
	        Stack<Character> st=new Stack<>();
	        
	        for(char ch: s.toCharArray()){
	            if(!st.isEmpty() && st.peek()==ch){
	                st.pop();
	            }
	            else{
	                st.push(ch);
	            }
	        }
	        String ans="";
	        while(!st.isEmpty()){
	            ans=st.pop()+ans;
	        }
	        return ans;
	        
	    }


}
