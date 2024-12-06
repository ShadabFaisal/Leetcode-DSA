package Arrays;

public class LeetCode566ReshapetheMatrix {

	public static void main(String[] args) {

		int[][] matrix= {{1,2,3},{3,4,5}};
		int r=2;int c=3;
		int[][] output=matrixReshape(matrix,r,c);
		
		
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[0].length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {

		int rows = mat.length;
		int col = mat[0].length;

		if ((rows * col) != r * c) {
			return mat;
		}

		int[][] ans = new int[r][c];
		int row_num = 0;
		int col_num = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				ans[row_num][col_num] = mat[i][j];
				col_num++;
				if (col_num == c) {
					col_num = 0;
					row_num++;
				}
			}

		}
		return ans;

	}

}

/*
 * 566. Reshape the Matrix
 * 
 * In MATLAB, there is a handy function called reshape which can reshape an m x
 * n matrix into a new one with a different size r x c keeping its original
 * data.
 * 
 * You are given an m x n matrix mat and two integers r and c representing the
 * number of rows and the number of columns of the wanted reshaped matrix.
 * 
 * The reshaped matrix should be filled with all the elements of the original
 * matrix in the same row-traversing order as they were.
 * 
 * If the reshape operation with given parameters is possible and legal, output
 * the new reshaped matrix; Otherwise, output the original matrix.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4 Output: [[1,2,3,4]] Example 2:
 * 
 * 
 * Input: mat = [[1,2],[3,4]], r = 2, c = 4 Output: [[1,2],[3,4]]
 * 
 * 
 * Constraints:
 * 
 * m == mat.length n == mat[i].length 1 <= m, n <= 100 -1000 <= mat[i][j] <=
 * 1000 1 <= r, c <= 300
 */
