package Matrix;

import java.util.Arrays;
import java.util.TreeMap;

public class LeetCode1235MaximumProfitInJobSequencing {

	public static void main(String[] args) {
		int[] startTime = {1,2,3,3}, endTime = {3,4,5,6}; 
		int[] profit = {50,10,40,70};
		System.out.println(jobScheduling(startTime,endTime,profit));

	}
	public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[][] jobs=new int[n][3];
        for(int i=0;i<n;i++){
            jobs[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }
        
        Arrays.sort(jobs,(a,b)-> a[1]-b[1]);
        
        TreeMap<Integer,Integer> dp =new TreeMap<>();
        dp.put(0,0);
        
        for(int[] job:jobs){
            int val=job[2]+dp.floorEntry(job[0]).getValue();
            if(val>dp.lastEntry().getValue()){
                dp.put(job[1],val);
            }
        }
        return dp.lastEntry().getValue();
    }

}
