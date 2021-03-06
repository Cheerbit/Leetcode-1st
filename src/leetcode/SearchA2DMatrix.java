package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 10:45:05 AM
 * Apr 17, 2015
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */
public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int low = 0; int high = matrix.length * matrix[0].length -1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int row = mid / matrix[0].length;
			int col = mid % matrix[0].length;
			if (target == matrix[row][col]) return true;
			else if (target < matrix[row][col]) high = mid - 1;
			else low = mid + 1;
		}
		
		return false;
    }
}
