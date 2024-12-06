package String;

import java.util.HashSet;

public class LeetCode345ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}
	public static String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            while(start<end && !vowels.contains(ch[start]+""))
                start++;
        
            while(start<end && !vowels.contains(ch[end]+""))
                end--;
            
            
            
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            
            start++;
            end--;
        }
        return new String(ch);
    }
	public static String reverseVowelsOpt(String s) {
	       HashSet<Character> vowels=new HashSet<>();
		    vowels.add('a'); vowels.add('A');
		    vowels.add('e'); vowels.add('E');
		    vowels.add('i'); vowels.add('I');
		    vowels.add('o'); vowels.add('O');
		    vowels.add('u'); vowels.add('U');
	        char[] ch=s.toCharArray();
	        int start=0;
	        int end=s.length()-1;
	        
	        while(start<end){
	            while(start<end && !vowels.contains(ch[start]))
	                start++;
	        
	            while(start<end && !vowels.contains(ch[end]))
	                end--;
	            
	            
	            
	            char temp=ch[start];
	            ch[start]=ch[end];
	            ch[end]=temp;
	            
	            start++;
	            end--;
	        }
	        return new String(ch);
	    }
}
