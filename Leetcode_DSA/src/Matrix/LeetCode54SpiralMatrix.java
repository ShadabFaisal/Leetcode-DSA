package Matrix;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));

	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,top=0;
        int right=m-1,bottom=n-1;
        List<Integer> ans=new ArrayList<>();

        while(top<=bottom && left<=right){

        for(int i=left;i<=right;i++){
            ans.add(matrix[top][i]);
        }
        top++;

        for(int i=top;i<=bottom;i++){
            ans.add(matrix[i][right]);
        }
        right--;

        if(top<=bottom){
        for(int i=right;i>=left;i--){
            ans.add(matrix[bottom][i]);
        }
        bottom--;
        }

        if(left<=right){
            for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
            }
        left++;
        }
       
        }

        return ans;
        
    }

}
