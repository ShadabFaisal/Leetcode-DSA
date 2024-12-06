package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

	public static void main(String[] args) {
		int[] a = {4,3,2,1};
		System.out.println(superiorElementsII(a));
	}
	
	//Brute-Force Approach to find the leaders in array. With TC-O(N^2) we use an extra space of O(N) to store the result.
	
	public static List<Integer> superiorElements(int[] a) {
		List<Integer> ans = new ArrayList<>();
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean leaders = true;
			for (int j = i + 1; j < n; j++) {
				if (a[j] >= a[i]) {
					leaders = false;
					break;
				}
			}
			if (leaders) {
				ans.add(a[i]);
			}
		}
		Collections.reverse(ans);
		return ans;
	}
	
	
	//Optimal Approach With TC-O(N) we use an extra space of O(N) to store the result.
	//Here, in this approach we start from the RHS of array and find the max at right of the current element
	//And, if the current element is greater than the max element that means it is the leader of the array.
	//So, here in this case the last element will always be the leader bcoz there is nothing on its RHS.
	//Based on the format given in the question , you can printthe result in the reverse order or the sequence given in the question.
	
	
	public static List< Integer > superiorElementsII(int []a) {
        // Write your code here.
        List<Integer> ans=new ArrayList<>();
        int n=a.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>maxi){
                ans.add(a[i]);
            }
            maxi=Math.max(maxi,a[i]);
        }
        
        return ans;
    }
}
