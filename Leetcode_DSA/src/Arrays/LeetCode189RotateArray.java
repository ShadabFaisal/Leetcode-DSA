package Arrays;

import java.util.Arrays;

public class LeetCode189RotateArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		rotate1(arr,4);
		System.out.println(Arrays.toString(arr));
	}
	
	 public static void rotate1(int[] nums, int k) {
	       k%=nums.length;
	       reverse(nums,0,nums.length-1);
	       reverse(nums,0,k-1);
	       reverse(nums,k,nums.length-1);
	    }

	    public static void reverse(int[] nums, int start, int end){
	        while(start<=end){
	            int temp=nums[start];
	            nums[start]=nums[end];
	            nums[end]=temp;
	            start++;
	            end--;
	        }
	    }
	
	//Time Limit Exceeded 37/38 cases passed
	public void rotate(int[] nums, int k) {
        int prev,temp;
        for(int i=0;i<k;i++){
            prev=nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                temp=nums[j];
                nums[j]=prev;
                prev=temp;
            }
        }
    }

}
