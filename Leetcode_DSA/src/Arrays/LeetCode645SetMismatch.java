package Arrays;

import java.util.Arrays;

public class LeetCode645SetMismatch {

	public static void main(String[] args) {
		int[] arr= {1,2,2,4};
		int[] ans=findErrorNums(arr);
		System.out.println(Arrays.toString(ans));

	}
	public static int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
           int correctIdx=nums[i]-1;
            if(nums[i]!=nums[correctIdx]){
                swap(nums,i,correctIdx);
            }
            else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return null;
    }
    public static void swap(int[] nums, int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }

}
