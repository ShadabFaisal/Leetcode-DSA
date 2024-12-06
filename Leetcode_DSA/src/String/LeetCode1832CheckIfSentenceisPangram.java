package String;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1832CheckIfSentenceisPangram {

	public static void main(String[] args) {
		String str="thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(str));

	}
	 public static boolean checkIfPangram(String sentence) {
         int[] appeared=new int[26];
            for(int i=0;i<sentence.length();i++){
                appeared[sentence.charAt(i)-'a']++;
            }
        
        for(int i=0;i<26;i++){
            if(appeared[i]<1)
                return false;
        }
        return true;
    }
	 
	 //Using HashSet
	 public static boolean checkIfPangramUsingSet(String sentence) {
	        Set<Character> set=new HashSet<Character>();
	        for(char ch: sentence.toCharArray()){
	            set.add(ch);
	        }
	        return set.size()==26;
	    }

}
