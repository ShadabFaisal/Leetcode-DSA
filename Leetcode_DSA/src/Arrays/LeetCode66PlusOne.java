package Arrays;

import java.util.Arrays;

public class LeetCode66PlusOne {

	public static void main(String[] args) {

		int[] nums= {1,2,9};
		int[] ans=plusOne(nums);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] plusOne(int[] digits) {

		int i;
		for (i = digits.length - 1; i >= 0 && digits[i] == 9; i--) {
			digits[i] = 0;
		}
		if (i == -1) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			return newDigits;
		}
		digits[i]++;

		return digits;
	}

	 public int[] plusOne2(int[] digits) {
	        int n=digits.length;
	        for(int i=n-1;i>=0;i--){
	            if(digits[i]<9){
	                digits[i]++;
	                return digits;
	            }
	            digits[i]=0;
	        }
	        int[] newNum=new int[n+1];
	        newNum[0]=1;
	        return newNum;
	        
	    }
}
