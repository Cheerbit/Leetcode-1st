package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 5:57:32 PM
 * Apr 25, 2015
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
public class SpiralMatrixII {
	 public int[][] generateMatrix(int n) {  
		   int val = 1;  
		   int[][] matrix = new int[n][n];  
		   
		   for (int level = 0; level < n; ++level, --n) {  
		     // top  
		     for (int i=level; i < n; ++i) matrix[level][i] = val++;  
		     // right  
		     for (int i=level+1; i < n; ++i) matrix[i][n-1] = val++;  
		     // bottom  
		     for (int i=n-2; i >= level; --i) matrix[n-1][i] = val++;  
		     // left  
		     for (int i=n-2; i > level; --i) matrix[i][level] = val++;  
		   }  
		   
		   return matrix;  
		 }  
}
