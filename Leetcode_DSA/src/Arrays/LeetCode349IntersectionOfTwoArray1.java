package Arrays;

import java.util.HashSet;

public class LeetCode349IntersectionOfTwoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {1,2,2,4,1};
		int[] nums2= {2,2,4};
		int[] result=intersect(nums1,nums2);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}

	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		
		
		HashSet<Integer> set = new HashSet<>();
		for (int i : nums1) {
			set.add(i);
		}
		
		HashSet<Integer> intersect= new HashSet<>();
		for(int i: nums2) {
			if(set.contains(i)) {
				intersect.add(i);
			}
		}
		
		int[] ans=new int[intersect.size()];
		int j=0;
		for(int i: intersect) {
			ans[j++]=i;
		}
		
		return ans; 

	}

}
/*349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000*/