package Matrix;

public class LeetCode766ToeplitzMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		System.out.println(isToeplitzMatrix(matrix));

	}

	public static boolean isToeplitzMatrix(int[][] matrix) {
		if (matrix == null)
			return false;

		if (matrix.length <= 1 || matrix[0].length <= 1)
			return true;

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] != matrix[i - 1][j - 1]) {
					return false;
				}
			}
		}
		return true;
	}

}
