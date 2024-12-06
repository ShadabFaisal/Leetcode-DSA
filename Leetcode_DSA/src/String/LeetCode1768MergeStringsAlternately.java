package String;

public class LeetCode1768MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mergeAlternately("abc","pqr"));

	}
	
public static String mergeAlternately(String word1, String word2) {  
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        int i=0,j=0;
        
        String s1="";
        while(i<ch1.length && j<ch2.length){
            s1=s1+ch1[i++]+ch2[j++];
        }
        while(i<ch1.length){
            s1=s1+ch1[i++];
        }
        
         while(j<ch2.length){
            s1=s1+ch2[j++];
         
        }
        return s1;
    }

}
