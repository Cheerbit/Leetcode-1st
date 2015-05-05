package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 8:52:53 PM
 * May 4, 2015
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
 */
public class RotateImage {
	public void rotate(int[][] matrix) {  
		   for (int level = 0, len = matrix.length; level < len; level++, len--) {  
		     int end = len - 1;  
		     for (int pos = level; pos < end; pos++) {  
		       int tail = matrix.length - pos - 1;  
		   
		       int tmp = matrix[level][pos];  
		       // left -> top  
		       matrix[level][pos] = matrix[tail][level];  
		       // bottom -> left  
		       matrix[tail][level] = matrix[end][tail];  
		       // right -> bottom  
		       matrix[end][tail] = matrix[pos][end];  
		       // top -> right  
		       matrix[pos][end] = tmp;  
		     }  
		   }  
	}  
}
