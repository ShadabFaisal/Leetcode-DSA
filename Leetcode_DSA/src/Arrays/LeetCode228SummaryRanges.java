package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228SummaryRanges {

	public static void main(String[] args) {
		int[] nums= {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));

	}
	
	 public static List<String> summaryRanges(int[] nums) {
	        List<String> ans=new ArrayList<>();
	        if(nums.length==0)return ans;
	        if(nums.length==1){
	            ans.add(""+nums[0]);
	            return ans;
	        }

	        int start=0,i=0;

	        for(;start<nums.length && i<nums.length;){
	            if(i<nums.length-1 && nums[i]+1==nums[i+1]){
	                i++;
	            }
	            else{
	                String range="";
	                if(start==i){
	                    range+=nums[start];
	                }
	                else{
	                    range=nums[start]+"->"+nums[i];
	                }
	                ans.add(range);
	                start=i+1;
	                i++;
	            }
	        }
	        return ans;
	        
	    }

}
