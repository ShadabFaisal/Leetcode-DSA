package Matrix;

public class LeetCode48RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

	}
	
	public static void rotate(int[][] matrix) {
        int[][] ans=new int[matrix.length][matrix[0].length];
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][n-1-i]=matrix[i][j];
            }
        }

       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }

}
