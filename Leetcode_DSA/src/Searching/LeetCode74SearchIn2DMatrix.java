package Searching;

public class LeetCode74SearchIn2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=53;
		boolean isFound=searchMatrix(matrix,target);
		System.out.println(isFound);

	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        
        for (int row = 0; row < matrix.length; row++) {
          for (int col = 0; col < matrix[row].length; col++) {
              if (matrix[row][col] == target) {
                  return true;
              }
          }
      }
      return false;
      
  }

}
/*74. Search a 2D Matrix

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104*/