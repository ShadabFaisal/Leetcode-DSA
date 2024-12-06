package String;

public class LeetCode28FindTheIndexOfFirstOccurenceInAString {

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStrOp(haystack,needle));
	}
	
	public static int strStrOp(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
	
	 public static int strStr(String haystack, String needle) {
	        for(int i=0;i<haystack.length()-needle.length()+1;i++){
	            if(haystack.charAt(i)==needle.charAt(0)){
	                if(haystack.substring(i,needle.length()+i).equals(needle)){
	                    return i;
	                }
	            }
	        }
	        return -1;
	    }

}
