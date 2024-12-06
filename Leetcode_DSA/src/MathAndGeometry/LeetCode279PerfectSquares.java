package MathAndGeometry;

public class LeetCode279PerfectSquares {

	public static void main(String[] args) {
		System.out.println(numSquares(12));
		System.out.println(numSquaresMem(12));
	}
	public static int numSquares(int n) {
        return f(n);
    }
    private static int f(int n){
        if(n<0)return Integer.MAX_VALUE;
        if(n==0)return 0;
        
        int min=n; //coz n(1*1) sums up to n;
        
        for(int i=1;i*i<=n;i++){
            min=Math.min(min,f(n-(i*i)));
        }
        
        return min+1;
    }
    
    //Memoization
    
    public static int numSquaresMem(int n) {
        int[] dp=new int[n+1];
        return f(n,dp);
    }
    private static int f(int n,int[] dp){
        if(n<0)return Integer.MAX_VALUE;
        if(n==0)return 0;
        if(dp[n]>0)return dp[n];
        
        int min=n; //coz n(1*1) sums up to n;
        
        for(int i=1;i*i<=n;i++){
            min=Math.min(min,f(n-(i*i),dp));
        }
        
        return dp[n]=min+1;
    }
    
    //Tabulation
    
    public static int numSquaresTab(int n) {
        int dp[]=new int [n+1];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<dp.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                min=Math.min(min,dp[i-j*j]);
            }
            dp[i]=min+1;
        }
        return dp[n];
    }

}
