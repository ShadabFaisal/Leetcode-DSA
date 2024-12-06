package StackAndQueue;

import java.util.Stack;

public class LeetCode71SimplifyPath {

	public static void main(String[] args) {
		String path = "/a/./b/..///c/";
		System.out.println(simplifyPath(path));
		
	}
	
	public static String simplifyPath(String path){
        Stack<String> st=new Stack<>();
        String[] paths=path.split("\\/");

        for(String p:paths){
            if(p.length()==0 || p.equals(".")){
            	//do nothing
                continue;
            }
            else if(p.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(p);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+"/"+ans;
        }

        if(ans.length()==0){
            return "/";
        }
        else{
            return "/"+ans.substring(0,ans.length()-1);
        }
    }

}
