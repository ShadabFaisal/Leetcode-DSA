package Arrays;

import java.util.Arrays;

public class LeetCode274H_Index {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}
	
	 public static int hIndex(int[] citations) {
	        Arrays.sort(citations);
	        int n=citations.length,i;
	        for(i=1;i<=n;i++){
	            if(citations[n-i]<i){
	                break;
	            }
	        }
	        return i-1;
	    }

}
