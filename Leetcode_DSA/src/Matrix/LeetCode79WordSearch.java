package Matrix;

public class LeetCode79WordSearch {

	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		System.out.println(exist(board,word));
	}

	public static boolean exist(char[][] board, String word) {

		char[] ch = word.toCharArray();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (ch[0] == board[i][j]) {
					boolean[][] visited = new boolean[board.length][board[0].length];
					if (dfs(board, ch, i, j, visited, 0)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean dfs(char[][] board, char[] word, int i, int j, boolean[][] visited, int index) {

		if (index == word.length) {
			return true;
		}
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] == true) {
			return false;
		}

		if (board[i][j] != word[index]) {
			return false;
		}

		visited[i][j] = true;

		if (dfs(board, word, i - 1, j, visited, index + 1) || dfs(board, word, i + 1, j, visited, index + 1)
				|| dfs(board, word, i, j - 1, visited, index + 1) || dfs(board, word, i, j + 1, visited, index + 1)) {
			return true;
		}
		visited[i][j] = false;

		return false;
	}

}
