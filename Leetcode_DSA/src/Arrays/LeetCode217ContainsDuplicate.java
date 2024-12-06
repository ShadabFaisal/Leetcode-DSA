package Arrays;

import java.util.Arrays;
import java.util.HashSet;

//Easy

public class LeetCode217ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,1};
		//System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicateUsingHashSet(arr));
	}
	 public static boolean containsDuplicate(int[] nums) {
	        
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]==nums[i+1]){
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 //Another Approach using HashSet.
	 public static boolean containsDuplicateUsingHashSet(int[] nums) {
	       
		 HashSet<Integer> set= new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            if(set.contains(nums[i]))
	                return true;
	                set.add(nums[i]);
	            }
	        return false;
	    }

}
/*217. Contains Duplicate
Easy

4898

961

Add to List

Share
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109*/
