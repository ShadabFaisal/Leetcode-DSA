package Arrays;

public class LeetCode136SingleNumber {

	public static void main(String[] args) {
		
		int[] nums= {2,2,1,1,4};
		int uniqueNum=singleNumber(nums);
		System.out.println(uniqueNum);

	}
	
	 public static int singleNumber(int[] nums) {
	        
	        /* Approach 1: Using HashMap
	        HashMap<Integer,Integer> map=new HashMap();
	        
	        
	        for(int i: nums){
	           if(map.containsKey(i)){
	               map.put(i, map.get(i)+1);
	           }
	            else{
	                map.put(i,1);
	            }
	        }
	        
	        
	        for(int k: map.keySet()){
	            if(map.containsKey(k)){
	                int freq=map.get(k);
	                if(freq==1){
	                    return k;
	                }
	            }
	        }
	        return 0;
	        
	        */
	        
	        
	        //Approach 2: Using Bit Manipulation
		 
		 
	        int result=0;
	        for(int i=0;i<nums.length;i++){
	            result^=nums[i];
	        }
	        
	        return result;
	        
	        
	        
	    }

}
