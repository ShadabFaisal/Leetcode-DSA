package String;

import java.util.Arrays;

public class LeetCode953VerifyingAnAlienDictionary {

	public static void main(String[] args) {
		String []words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words,order));
		System.out.println('h'-'a');
	}
	
	   public static boolean isAlienSorted(String[] words, String order) {
	        int[] mapping=new int[26];
	        int seq=0;
	        for(char ch: order.toCharArray()){
	            mapping[ch-'a']=seq++;
	        }
	        System.out.println(Arrays.toString(mapping));
	        
	        for(int i=0;i<words.length-1;i++){
	            String curr=words[i];
	            String next=words[i+1];
	            
	            int len=Math.min(curr.length(), next.length());
	            
	            if(len!=curr.length() && len==next.length() && curr.startsWith(next)){
	                return false;
	            }
	            
	            for(int j=0;j<len;j++){
	                if(mapping[curr.charAt(j)-'a'] > mapping[next.charAt(j)-'a']){
	                    return false;
	                }
	                if(mapping[curr.charAt(j)-'a'] < mapping[next.charAt(j)-'a']){
	                    break;
	                }
	            }
	        }
	        return true;
	    }

}
