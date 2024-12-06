package Arrays;

import java.util.Arrays;

public class LeetCode31NextPermutation {

	public static void main(String[] args) {
		int[] nums= {3,2,1};
		nextPermutation(nums);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){//break point
                ind=i;
                break;
            }
        }
        //If break point does not exist
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }

        reverse(nums,ind+1,n-1);
        
    }

    private static void reverse(int[] nums, int start, int end){
        while(start<=end){
             int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;   
        }
    }

}
