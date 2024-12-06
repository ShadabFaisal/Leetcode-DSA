package Matrix;

import java.util.HashSet;

public class LeetCode36ValidSudoku {

	public static void main(String[] args) {
		char[][] board = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		
		System.out.println(isValidSudoku(board));
	}

	public static boolean isValidSudoku(char[][] board) {
		 HashSet<String> set=new HashSet<>();

	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[0].length;j++){
	                if(board[i][j]!='.'){
	                    if(!set.add("row"+i+board[i][j]) || !set.add("col"+j+board[i][j]) ){
	                        return false;
	                    }
	                    if(!set.add("box"+((i/3)*3+(j/3))+board[i][j])){
	                        return false;
	                    }
	                }
	                
	            }
	        }
	        return true;
	}

}
