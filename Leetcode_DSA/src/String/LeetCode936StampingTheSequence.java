package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode936StampingTheSequence {

	public static void main(String[] args) {
		String stamp="abc";
		String target="ababc";
		int[] result=movesToStamp(stamp,target);
		System.out.println(Arrays.toString(result));

	}
	
	public  static int[] movesToStamp(String stamp, String target) {
        char[] t1=target.toCharArray();
        char[] s1=stamp.toCharArray();
        int count=0;
        boolean[] visited=new boolean[t1.length];
        List<Integer> ans=new ArrayList<>();
        
        while(count!=t1.length){
            boolean didChange=false;
            for(int i=0;i<=(t1.length-s1.length);i++){
                if(!visited[i] && canReplace(t1,i,s1)){
                    count=replace(t1,i,s1.length,count);
                    visited[i]=true;
                    didChange=true;
                    ans.add(i);
                    if(count==t1.length){
                        break;
                    }
                }
            }
            if(!didChange){
                return new int[0];
            }
        }
        
        int[] result=new int[ans.size()];
        int k=0;
        for(int i=ans.size()-1;i>=0;i--){
            result[k++]=ans.get(i);
        }
        return result; 
    }
    
    static boolean canReplace(char[] t1, int pos, char[] s1){
        for(int i=0;i<s1.length;i++){
            if(t1[i+pos]!='?' && t1[i+pos]!=s1[i] ){
                return false;
            }
        }
        return true;
    }
    static int replace(char[] t1, int pos, int len, int count){
        for(int i=0;i<len;i++){
            if(t1[i+pos] !='?'){
                t1[i+pos]='?';
                count++;
            }
        }
        return count;
    }

}
