package Graphs;

import java.util.HashMap;
import java.util.Map;

public class LeetCode997FindTheTownJudge {

	public static void main(String[] args) {
		int n = 3;
		//int trust[][] = {{1,3},{2,3},{3,1}};
		int trust[][] = {{1,3},{2,3}};
		System.out.println(findJudge(n,trust));
		System.out.println(findJudge2(n,trust));
	}

	public static int findJudge(int n, int[][] trust) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int[] t : trust) {
			// [a, b]
			// a trusts b, decrease a's count coz he'll never be the judge
			// b is trusted by a, increase b's count
			map.put(t[1], map.getOrDefault(t[1], 0) + 1);
			map.put(t[0], map.getOrDefault(t[0], 0) - 1);
		}

		// now we will check from 1-n, who has got n-1 trusts
		// this will give us the rsult for 2nd condition
		// 2. Everybody (except for the town judge) trusts the town judge (n-1)

		for (int i = 1; i <= n; i++) {
			if (map.getOrDefault(i, 0) == n - 1) {
				return i;
			}
		}

		// if no one got n-1 trusts, there is no judge
		return -1;
	}
	
	 public static int findJudge2(int n, int[][] trust) {
	        int[] inward=new int[n+1];
	        int[] outward=new int[n+1];

	        for(int i=0;i<trust.length;i++){
	            outward[trust[i][0]]=outward[trust[i][0]]+1;
	            inward[trust[i][1]]=inward[trust[i][1]]+1;
	        }

	        for(int i=1;i<=n;i++){
	            if(inward[i]==n-1 && outward[i]==0){
	                return i;
	            }
	        }
	        return -1;
	    }

}
