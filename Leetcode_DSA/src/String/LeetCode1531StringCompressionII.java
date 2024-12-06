package String;

import java.util.Arrays;

public class LeetCode1531StringCompressionII {

	public static void main(String[] args) {
		String s="aaabcccd";
		System.out.println(getLengthOfOptimalCompression(s,2));
		

	}
	private static int[][] dp;
    private static char[] chars;
    private static int n;
    public static int getLengthOfOptimalCompression(String s, int k) {
        chars=s.toCharArray();
        n=s.length();
        dp=new int[n][k+1];
        
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        
        return dp(0,k);
    }
    private static int dp(int i, int k){
        if(k<0)
            return n;
        if(n<=i+k)
            return 0;
        
        int ans=dp[i][k];
        
        if(ans!=-1)
            return ans;
        ans=dp(i+1,k-1);
        
        int length=0,same=0,diff=0;
        
        for(int j=i;j<n && diff<=k;j++){
            if(chars[j]==chars[i]){
                same++;
                if(same<=2 || same==10 || same==100)length++;
            }
            else{
                diff++;
            }
            ans=Math.min(ans,length+dp(j+1,k-diff));
        }
        dp[i][k]=ans;
        return ans;
    }

}
