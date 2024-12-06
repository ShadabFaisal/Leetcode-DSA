package String;

import java.util.Stack;

public class LeetCode20ValidParentheses {

	public static void main(String[] args) {
		String s="(){}[]";
		System.out.println(isValid(s));

	}
	
	public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                 char c=st.pop();;
                 
                 if((s.charAt(i)==')' && c=='(') || (s.charAt(i)==']' && c=='[') || (s.charAt(i)=='}' && c=='{')){
                    continue;
                 }
                 else{
                     return false;
                 }
            }
        }
        return st.isEmpty();
    }

}
