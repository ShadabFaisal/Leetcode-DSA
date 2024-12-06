package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode989AddToArrayFormOfInteger {

	public static void main(String[] args) {
		int[] num = {2,7,4};
		int k = 1810;
		System.out.println(addToArrayForm(num,k));
	}
	
	//Brute-force Approach works for every cases doesn't give TLE
	public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int len=num.length;
        
        //num=[1,2,0,0]

        for(int i=len-1;i>=0;i--){
            int n=num[i];// 0, 0, 2,
            int sum=n+k;//0+34=34, 0+3=3, 2+0=2 
            //adding k to the last digit of the array 
            int rem=sum%10;//34%10=4, 3%10=3, 2%10=2, 1%10=1  
            //extracting the last digit of the sum
            ans.add(0,rem);//[2,3,4]
            //adding it at the front of the list and continue in the reverse process;
            k=sum/10;//k=3, k=0
        }

        while(k>0){
            ans.add(0,k%10);
            k/=10;
        }
        return ans;
    }

}
