package leetcode;

import java.util.HashSet;

/**
 * Created by 7 
 * @Buffalo
 * 2:17:45 PM
 * Dec 21, 2014
 * Determine if a Sudoku is valid
 * Rules of Sudoku:
Each row must have the numbers 1-9 occuring just once.
Each column must have the numbers 1-9 occuring just once.
And the numbers 1-9 must occur just once in each of the 9 sub-boxes of the grid.

The Sudoku board could be partially filled, 
where empty cells are filled with the character '.'.

Note:
A valid Sudoku board (partially filled) 
is not necessarily solvable. Only the filled cells need to be validated.
 */
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null) {
			return false;
		}
		
		for (int i = 0; i < board[0].length; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != '.' && !set.add(board[j][i])) {
					return false;
				}
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.' && !set.add(board[i][j])) {
					return false;
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				HashSet<Character> set = new HashSet<Character>();
				for (int m = i * 3; m < i * 3 + 3; m++) {
					for (int n = j * 3; n < j * 3 + 3; n++) {
						if (board[m][n] != '.' && !set.add(board[m][n])) {
							return false;
						}
					}
				}
			}
		}
		
		return true;
		
	}
}
