package Arrays;

import java.util.Arrays;

public class LeetCode238ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
	//Optimised Approach
	public static int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        int product=1;
        for(int i=0;i<output.length;i++){
            product*=nums[i];
            output[i]=product;
        }

        product=1;
        for(int i=nums.length-1;i>0;i--){
            output[i]=output[i-1]*product;
            product*=nums[i];
        }
        output[0]=product;

        return output;
    }

}
