package Arrays;

import java.util.Arrays;

public class LeetCode122BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfitMemo(prices));
		

	}
	
	 public static int maxProfitMemo(int[] prices) {
	        int[][] dp=new int[prices.length][2];
	        for(int[] row:dp){
	            Arrays.fill(row,-1);
	        }

	        return fMemo(0,1,prices,prices.length,dp);
	    }
	    public static int fMemo(int ind,int buy,int[] prices, int n,int[][] dp){
	        if(ind==n){
	            return 0;
	        }
	        if(dp[ind][buy]!=-1)return dp[ind][buy];
	        int profit=0;
	        if(buy==1){
	            profit=Math.max(-prices[ind]+fMemo(ind+1,0,prices,n,dp),0+fMemo(ind+1,1,prices,n,dp));
	        }
	        else{
	            profit=Math.max(prices[ind]+fMemo(ind+1,1,prices,n,dp),0+fMemo(ind+1,0,prices,n,dp));
	        }

	        return dp[ind][buy]=profit;
	    }
	
	//Recursive Approach
	
	public int maxProfit(int[] prices) {
        return f(0,1,prices,prices.length);
    }
    public int f(int ind,int buy,int[] prices, int n){
        if(ind==n){
            return 0;
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+f(ind+1,0,prices,n),0+f(ind+1,1,prices,n));
        }
        else{
            profit=Math.max(prices[ind]+f(ind+1,1,prices,n),0+f(ind+1,0,prices,n));
        }

        return profit;
    }

}
