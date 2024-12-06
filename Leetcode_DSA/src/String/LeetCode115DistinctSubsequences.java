package String;

import java.util.Arrays;

public class LeetCode115DistinctSubsequences {

	public static void main(String[] args) {
		String s="babgbag";
		String t="bag";
		System.out.println(numDistinct(s,t));

	}

	// Recursive Approach

	static int f(int i, int j, String s, String t) {
		if (j < 0)
			return 1;
		if (i < 0)
			return 0;

		if (s.charAt(i) == t.charAt(j)) {
			return f(i - 1, j - 1, s, t) + f(i - 1, j, s, t);
		}

		return f(i - 1, j, s, t);
	}

	public static int numDistinct(String s, String t) {
		int n = s.length();
		int m = t.length();
		return f(n - 1, m - 1, s, t);
	}

	// Memoization

	public static int f(int i, int j, String s, String t, int[][] dp) {
		if (j < 0)
			return 1;
		if (i < 0)
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		if (s.charAt(i) == t.charAt(j)) {
			return dp[i][j] = f(i - 1, j - 1, s, t, dp) + f(i - 1, j, s, t, dp);
		}

		return dp[i][j] = f(i - 1, j, s, t, dp);
	}

	public static int numDistinctMemoiz(String s, String t) {
		int n = s.length();
		int m = t.length();
		int[][] dp = new int[n][m];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}

		return f(n - 1, m - 1, s, t, dp);
	}

	// TABULATION

	public static int subsequenceCounting(String t, String s, int lt, int ls) {
		int[][] dp = new int[lt + 1][ls + 1];
		for (int i = 0; i <= lt; i++)
			dp[i][0] = 1;
		for (int j = 1; j <= ls; j++)
			dp[0][j] = 0;

		for (int i = 1; i <= lt; i++) {
			for (int j = 1; j <= ls; j++) {
				if (t.charAt(i - 1) == s.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[lt][ls];
	}
	
	//SpaceOptimisation
	
	public static int subsequenceCountingSpOp(String t, String s, int lt, int ls)     {     
        double[] prev=new double[ls+1];
       prev[0]=1;
        for(int i=1;i<=lt;i++){
            double[] cur=new double[ls+1];
                              cur[0]=1;
            for(int j=1;j<=ls;j++){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    cur[j]=prev[j-1]+prev[j];
                }
                else{
                    cur[j]=prev[j];
                }
            }
                              prev=cur;
        }
        
        
        return (int)prev[ls];
    }
	
	//Space Optimisation 2
	public static int subsequenceCountingSpOp2(String t, String s, int lt, int ls)     {     
        double[] prev=new double[ls+1];
       prev[0]=1;
        for(int i=1;i<=lt;i++){
            for(int j=ls;j>=1;j--){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    prev[j]=prev[j-1]+prev[j];
                }
            }
        }
        
        
        return (int)prev[ls];
    }

}
