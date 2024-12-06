package String;

public class LeetCode151ReverseWordsInAString {

	public static void main(String[] args) {
		String s="a good   example";
		System.out.println(reverseWords(s));

	}
	
	 public static String reverseWords(String s) {
	        String[] words=s.trim().split(" +");
	        String s1="";
	        for(int i=words.length-1;i>=0;i--){
	            s1+=words[i]+" ";
	        }
	        return s1.trim();
	    }

}
