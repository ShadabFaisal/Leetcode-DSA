package Arrays;

import java.util.Arrays;

public class LeetCode2300SuccessfulPairsOfSpellsAndPotions {

	public static void main(String[] args) {
		int[] spells = {5,1,3}, potions = {1,2,3,4,5};
		int success = 7;
		int[] ans=successfulPairs(spells,potions,success);
		System.out.println(Arrays.toString(ans));

	}
	public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        Arrays.sort(potions);
        int ans[]=new int[n];
       for(int i=0;i<n;i++){
           int spell=spells[i];
           int l=0,h=m-1;
           while(l<=h){
               int mid=(l+h)/2;
               long product=(long) spell*potions[mid];
               if(product>=success){
                   h=mid-1;
               }
               else{
                   l=mid+1;
               }
           }
               ans[i]=m-l;
           
       }
        return ans;
    }

}
