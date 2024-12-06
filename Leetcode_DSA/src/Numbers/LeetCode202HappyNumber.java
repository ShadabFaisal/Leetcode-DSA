package Numbers;

import java.util.Scanner;

public class LeetCode202HappyNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isHappy(n));
		sc.close();
	        
	}
	 public static boolean isHappy(int n) {
	        
	        int slow=n;
	        int fast=n;
	        
	        
	        do{
	            slow=findSquareSum(slow);
	            fast=findSquareSum(findSquareSum(fast));
	        }while(slow!=fast);
	        
	        if(slow==1){
	            return true;
	        }
	        return false;
	    }
	    
	    static int findSquareSum(int n){
	        int s=0;
	        while(n!=0){
	            int r=n%10;
	            s+=r*r;
	            n/=10;
	        }
	        return s;
	    }

}
