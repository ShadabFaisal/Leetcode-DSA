package String;

import java.util.Arrays;

public class LeetCode899OrderlyQueue {

	public static void main(String[] args) {
		String s = "cba"; 
		int k = 1;
		System.out.println(orderlyQueue(s,k));
	}
	public static String orderlyQueue(String s, int k) {
        if(k>1){
            char[] s2=s.toCharArray();
            Arrays.sort(s2);
            return new String(s2);
        }
        String res=s;
        for(int i=1;i<s.length();i++){
            String temp=s.substring(i)+s.substring(0,i);
            if(res.compareTo(temp)>0)res=temp;
        }
        return res;
    }

}
