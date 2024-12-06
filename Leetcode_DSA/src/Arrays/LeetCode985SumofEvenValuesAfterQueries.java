package Arrays;

import java.util.Arrays;

public class LeetCode985SumofEvenValuesAfterQueries {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[][] queries= {{1,0},{-3,1},{-4,0},{2,3}};
		//int[] ans=sumEvenAfterQueries1(nums, queries);
		int[] answer=sumEvenAfterQueries2(nums, queries);
		System.out.println(Arrays.toString(answer));
	}
	
	 public static int[] sumEvenAfterQueries2(int[] nums, int[][] queries) {
	        int[] answer=new int[queries.length];
	       int even_sum=0;
	        
	        for(int j=0;j<nums.length;j++){
	                if(nums[j]%2==0){
	                    even_sum+=nums[j];
	                }
	            }
	        for(int i=0;i<queries.length;i++){
	            int index=queries[i][1];
	            int value=queries[i][0];
	           
	            if(nums[index]%2==0){
	                even_sum-=nums[index];
	            }
	            
	            nums[index]+=value;
	            
	            if(nums[index]%2==0){
	                even_sum+=nums[index];
	            }  
	            answer[i]=even_sum;
	        }
	        
	        
	        return answer;
	    }
	 
	 
	//Brute-Force Approach
	public static int[] sumEvenAfterQueries1(int[] nums, int[][] queries) {
        int[] answer=new int[queries.length];
        int k=0;
        for(int i=0;i<queries.length;i++){
            int sum=0;
            nums[queries[i][1]]=nums[queries[i][1]]+queries[i][0];
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0){
                    sum+=nums[j];
                }
            }
            answer[k++]=sum;
        }
        
        
        return answer;
    }

}
