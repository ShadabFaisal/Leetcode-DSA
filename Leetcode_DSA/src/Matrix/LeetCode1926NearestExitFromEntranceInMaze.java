package Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1926NearestExitFromEntranceInMaze {

	public static void main(String[] args) {
		char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
		int[] entrance = {1,2};
		System.out.println(nearestExit(maze, entrance));

	}
	
	public static int nearestExit(char[][] maze, int[] entrance) {
        int rows=maze.length, col=maze[0].length,size;
        Queue<int[]> queue=new LinkedList<>();
        boolean[][] visited=new boolean[rows][col];
        int[] curr;
        int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
        int x,y,steps=0;
        queue.offer(entrance);
        visited[entrance[0]][entrance[1]]=true;
        
        while(!queue.isEmpty()){
            size=queue.size();
            steps++;
            for(int i=0;i<size;i++){
                curr=queue.poll();
                for(int[] dir:dirs){
                    x=dir[0]+curr[0];
                    y=dir[1]+curr[1];
                    
                    if(x<0||x>=rows||y<0||y>=col)continue;
                    if(visited[x][y] || maze[x][y]=='+')continue;
                    
                    if(x==0||x==rows-1||y==0||y==col-1)return steps;
                    
                    queue.offer(new int[]{x,y});
                    visited[x][y]=true;
                }
            }
        }
        
        return -1;
    }

}
