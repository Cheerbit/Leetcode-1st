package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 5:40:15 PM
 * Apr 25, 2015
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int[][] sum = new int[grid.length][2];
        sum[0][0] = grid[0][0];
        int row = 0;
        for (int j = 1; j < grid.length; j ++ ) {
        		sum[j][row] = grid[j][0] + sum[j-1][row];
        }
        
        for (int i=1; i<grid[0].length; ++i) {  
            // switch the two rows  
            row = 1 - row;  
            // initialize the first element in the row  
            sum[0][row] = grid[0][i] + sum[0][1-row];  
            for (int j=1; j<grid.length; ++j) {  
              sum[j][row] = Math.min(sum[j-1][row], sum[j][1-row]);  
              sum[j][row] += grid[j][i];  
            }  
          }  
          
          return sum[grid.length-1][row]; 
    }
}
