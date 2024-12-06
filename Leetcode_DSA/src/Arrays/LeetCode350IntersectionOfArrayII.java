package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode350IntersectionOfArrayII {

	public static void main(String[] args) {
		
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] result=intersect(nums1,nums2);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map1= new HashMap<>();
        HashMap<Integer,Integer> map2= new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i]) +1);
            }
            else{
                map1.put(nums1[i],1);
            }
        }
                         
        for(int i=0;i<nums2.length;i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i], map2.get(nums2[i]) +1);
            }
            else{
                map2.put(nums2[i],1);
            }
        }
        
        for(int key: map1.keySet()){
            if(map2.containsKey(key)){
                int x=Math.min(map1.get(key), map2.get(key));
                 while(x-- > 0){
                    list.add(key);
                 }   
            }
        }
        
        int[] result=new int[list.size()];
                         
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
                         
        return result;
        
    }
	

}

/*350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000*/
