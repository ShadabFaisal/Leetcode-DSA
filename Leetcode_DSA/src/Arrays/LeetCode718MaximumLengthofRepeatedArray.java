package Arrays;

public class LeetCode718MaximumLengthofRepeatedArray {

	public static void main(String[] args) {
		int[] nums1= {1,2,3,2,1};
		int[] nums2= {3,2,1,4,7};
		System.out.println(findLength(nums1,nums2));
	}
	 public static int findLength(int[] nums1, int[] nums2) {
	        int[][] dp =new int[nums1.length+1][nums2.length+1];
	        int max_len=0;
	        
	        for(int i=1;i<dp.length;i++){
	            for(int j=1;j<dp[0].length;j++){
	                if(nums1[i-1]!=nums2[j-1]){
	                    dp[i][j]=0;
	                }
	                else{
	                    dp[i][j]=dp[i-1][j-1]+1;
	                    max_len=Math.max(dp[i][j],max_len);
	                }
	            }
	        }
	        return max_len;
	    }

}
