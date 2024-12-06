package Numbers;

public class LeetCode263UglyNumber {

	public static void main(String[] args) {
		System.out.println(isUgly(6));
	}
	
	 public static boolean isUgly(int n) {
	        
	        for(int i=2;i<=5 && n>0;i++){
	            while(n%i==0)
	                n/=i;
	        }
	        return n==1;
	    }

}
