package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode907SumOfSubarrayMinimums {

	public static void main(String[] args) {
		int[] arr= {3,1,4,2};
		System.out.println(sumSubarrayMins(arr));
		
	}
	
	 public static int sumSubarrayMins(int[] arr) {
	        int mod=1000000007;
	        int len=arr.length;
	        
	        int[] leftmin=new int[len];
	        Arrays.fill(leftmin,-1);
	        int[] rightmin=new int[len];
	        Arrays.fill(rightmin,len);
	        
	        Stack<Integer> s=new Stack<>();
	        
	        //Monotonic stacks
	        for(int i=0;i<len;i++){
	            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
	                int index=s.pop();
	                rightmin[index]=i;
	            }
	            s.push(i);
	        }
	        s.clear();
	        for(int i=len-1;i>=0;i--){
	            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
	                int index=s.pop();
	                leftmin[index]=i;
	            }
	            s.push(i);
	        }
	        s.clear();
	        
	        long res=0;
	        for(int i=0;i<len;i++){
	            int leftlen=i-leftmin[i];
	            int rightlen=rightmin[i]-i;
	            res=(res+((long) arr[i]*leftlen*rightlen)%mod)%mod;
	        }
	        return (int)res;
	        
	        
	        
	    }

}
