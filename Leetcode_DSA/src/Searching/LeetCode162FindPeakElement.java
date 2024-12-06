package Searching;

public class LeetCode162FindPeakElement {

	public static void main(String[] args) {
		int[]  nums = {1,2,3,4,5,4,3,4,5,6,7,8,1};
		System.out.println(nums[findPeakElement(nums)]);

	}
	
	public static int findPeakElement(int[] nums) {
	       int start=0;
	        int end=nums.length-1;

	        while(start<end){
	            int mid=start+(end-start)/2;
	            if(nums[mid]>nums[mid+1]){
	                end=mid;
	            }
	            else{
	                start=mid+1;
	            }
	        }
	        return start;  
	    }

}
