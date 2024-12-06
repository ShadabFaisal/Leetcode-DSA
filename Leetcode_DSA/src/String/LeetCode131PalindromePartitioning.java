package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode131PalindromePartitioning {

	public static void main(String[] args) {
		String s="aab";
		System.out.println(partition(s));
	}
	
	 public static List<List<String>> partition(String s) {
	        List<List<String>> res=new ArrayList<>();
	        helper(res,new ArrayList<String>(),s);
	        return res;
	    }
	    public static void helper(List<List<String>> res,List<String> currList,String s){
	        if(s.length()==0){
	            res.add(new ArrayList<String>(currList));
	            return;
	        }

	        for(int i=0;i<s.length();i++){
	            if(checkPalindrome(s,0,i)){
	                //found one portion as palindorme
	                currList.add(s.substring(0,i+1));
	                //apply dfs for rest
	                helper(res,currList,s.substring(i+1));
	                //backtrack
	                currList.remove(currList.size()-1);
	            }
	        }
	    }
	    private static boolean checkPalindrome(String s, int i, int j){
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }

}
