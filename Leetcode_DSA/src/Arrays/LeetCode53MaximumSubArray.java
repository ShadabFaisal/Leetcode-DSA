package Arrays;


//Kadane's Algorithm
public class LeetCode53MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = {5,4,-1,7,8};
		System.out.println("Maximum Sum of Subarray: "+maxSubArray(nums));	
	}
	 public static int maxSubArray(int[] nums) {
	        int sum=0;
	        int max=nums[0];
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            if(sum > max){
	                max=sum;
	            }
	            if(sum<0){
	                sum=0;
	            }
	        }
	        return max;
	    }

}



/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104*/
