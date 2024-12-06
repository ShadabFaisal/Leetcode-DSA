package Arrays;

public class LeetCode724FindPivotIndex {

	public static void main(String[] args) {
		
		int[] arr= {1,7,3,2,5,6,7};
		System.out.println(pivotIndex(arr));
	}
	
	 public static int pivotIndex(int[] nums) {
	        
	        int total_sum=0;
	        for(int i=0;i<nums.length;i++){
	            total_sum+=nums[i];
	        }
	        
	        int leftsum=0;
	        for(int i=0;i<nums.length;i++){
	            if(i!=0)leftsum+=nums[i-1];
	            if(total_sum-leftsum-nums[i]==leftsum){
	                return i;
	            }
	        }
	        
	        return -1;
	    }

}
