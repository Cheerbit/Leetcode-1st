package leetcode;

import java.util.ArrayList;

/**
 * Created by 7 
 * @BayArea
 * 9:10:18 PM
 * May 3, 2015
 * Given a matrix of m x n elements (m rows, n columns), 
 * return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
 */
public class SpiralMatrix {
	public ArrayList<Integer> spiralOrder(int[][] matrix) {  
		   ArrayList<Integer> spiral = new ArrayList<Integer>();  
		   if (matrix.length == 0 || matrix[0].length == 0) return spiral;  
		   
		   for (int level = 0, m = matrix.length, n = matrix[0].length;  
		       m > level && n > level;level++, m--, n--) {  
		     int right = n - 1;  
		     int bottom = m - 1;  
		   
		     // top row  
		     for (int i = level; i <= right; i++) spiral.add(matrix[level][i]);  
		     if (bottom == level) return spiral;  
		     // right column (from second to end)  
		     for (int i = level+1; i <= bottom; i++) spiral.add(matrix[i][right]);  
		     if (right == level) return spiral;  
		     // bottom row  
		     for (int i = right-1; i >= level; i--) spiral.add(matrix[bottom][i]);  
		     // left column  
		     for (int i = bottom-1; i > level; i--) spiral.add(matrix[i][level]);  
		   }  
		   
		   return spiral;  
		 }  
}
