package Matrix;

public class LeetCode835ImageOverlap {

	public static void main(String[] args) {
		int[][] img1 = {{1,1,0},{0,1,0},{0,1,0}};
		int[][] img2 = {{0,0,0},{0,1,1},{0,0,1}};
		System.out.println(largestOverlap(img1,img2));

	}

	static int n;

	public static int largestOverlap(int[][] img1, int[][] img2) {
		n = img1.length;
		int ans = 0;
		int[][] count = new int[2 * n + 1][2 * n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (img1[i][j] == 1) {
					for (int i2 = 0; i2 < n; i2++) {
						for (int j2 = 0; j2 < n; j2++) {
							if (img2[i2][j2] == 1)
								count[i - i2 + n][j - j2 + n] += 1;
						}
					}
				}
			}
		}
		for (int[] row : count) {
			for (int v : row) {
				ans = Math.max(ans, v);
			}
		}
		return ans;
	}

}
