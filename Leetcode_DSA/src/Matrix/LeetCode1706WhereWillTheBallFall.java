package Matrix;

import java.util.Arrays;

public class LeetCode1706WhereWillTheBallFall {

	public static void main(String[] args) {
		int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
		System.out.println(Arrays.toString(findBall(grid)));

	}
	
	static int[] ans;
	    static public int[] findBall(int[][] grid) {
	        ans=new int[grid[0].length];
	        Arrays.fill(ans,-1);
	        for(int j=0;j<grid[0].length;j++){
	            dfs(0,j,grid,j);
	        }
	        return ans;
	    }
	    
	   static void dfs(int i, int j ,int[][] grid, int startIndex){
	        if(i==grid.length){
	            ans[startIndex]=j;
	            return;
	        }
	        if(grid[i][j]==1){
	            if(j+1<grid[0].length && grid[i][j+1]==1){
	                dfs(i+1,j+1,grid, startIndex);
	            }
	            else{
	                return;
	            }
	        }
	        else if(grid[i][j]==-1){
	            if(j-1>=0 && grid[i][j-1]==-1){
	                dfs(i+1,j-1,grid,startIndex);
	            }
	            else{
	                return;
	            }
	        }
	    }

}
