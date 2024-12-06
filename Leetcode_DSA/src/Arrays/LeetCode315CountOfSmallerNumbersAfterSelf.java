package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode315CountOfSmallerNumbersAfterSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {5,2,6,1};
		List<Integer> ans=countSmaller(nums);
		System.out.println(ans);

	}

	//Brute-Force Approach
	 public static List<Integer> countSmaller(int[] nums) {
	        
	        List<Integer> ans =new ArrayList<Integer>();
	        int count=0;
	        
	        for(int i=0;i<nums.length;i++){
	            int element=nums[i];
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[j]<element){
	                    count++;
	                }
	            }
	            ans.add(count);
	            count=0;
	        }
	        return ans;
	        
	    }
}
