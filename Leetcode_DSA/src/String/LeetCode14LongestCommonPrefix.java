package String;

public class LeetCode14LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String commonPrefix(String s1,String s2){
        int n=Math.min(s1.length(),s2.length());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            res=commonPrefix(res,strs[i]);
        }
        return res;
    }

}
