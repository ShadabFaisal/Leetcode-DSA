package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1239MaxLenofConacatenatedStringofUniqueChars {

	public static void main(String[] args) {
		List<String> arr=new ArrayList<>();
		arr.add("un");
		arr.add("iq");
		arr.add("ue");
		System.out.println(maxLength(arr));
	}
	
	public static int maxLength(List<String> arr) {
        List<String> ansList=new ArrayList<>();
        int ans=0;
        ansList.add("");
        
        for(String str: arr){
            if(!checkUniqueCharString(str)){
                continue;
            }
            List<String> newAnsList=new ArrayList<String>();
            for(String s: ansList){
                String temp=s+str;
                if(checkUniqueCharString(temp)){
                    newAnsList.add(temp);
                    ans=Math.max(ans,temp.length());
                }
            }
            ansList.addAll(newAnsList);
        }
        return ans;
    }
    private static boolean checkUniqueCharString(String str){
        if(str.length()>26)return false;
        int[] freq=new int[26];
        
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']>1){
                return false;
            }
        }
        return true;
    }

}
