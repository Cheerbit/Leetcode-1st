package leetcode;

import java.util.HashSet;

/**
 * Created by 7 
 * @BayArea
 * 11:32:16 AM
 * Apr 17, 2015
 * Given a m x n matrix, 
 * if an element is 0, set its entire row and column to 0. Do it in place.
 */
public class SetMatrixZeroes {

	
	public void setZeroes(int[][] matrix) {
		
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> columns = new HashSet<Integer>();
		for (int i = 0; i< matrix.length; i++) {
			for (int j = 0; j< matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					columns.add(j);
				}
			}
		}
		
		for (int i = 0; i< matrix.length; i++) {
			for (int j = 0; j< matrix[0].length; j++) {
				if (rows.contains(i) || columns.contains(j)) 
					matrix[i][j]=0;
			}
		}
	}
	
	
}
