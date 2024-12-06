package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode57InsertIntervals {

	public static void main(String[] args) {
		int[][] intervals= {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval= {4,8};
		int[][] ans=insert(intervals,newInterval);
		
		for(int[] a:ans) {
			System.out.print(a[0]+","+a[1]+" ");
		}
	}
	 public static int[][] insert(int[][] intervals, int[] newInterval) {
	       List<int[]> ans=new ArrayList<>(); 
	       int i=0;
	       int len=intervals.length;

	    //For non-overlapping intervals
	       while(i<len && intervals[i][1]<newInterval[0]){
	           ans.add(intervals[i]);
	           i++;
	       }

	       while(i<len && intervals[i][0]<=newInterval[1]){
	           newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
	           newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
	           i++;
	       }

	       ans.add(newInterval);

	       while(i<len){
	           ans.add(intervals[i]);
	           i++;
	       }
	        return ans.toArray(new int[0][]);      
	   
	    }

}
