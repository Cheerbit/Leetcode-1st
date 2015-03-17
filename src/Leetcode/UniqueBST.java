package Leetcode;

/**
 * Created by 7 
 * @BayArea
 * 6:01:15 PM
 * Mar 16, 2015
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
public class UniqueBST {
	 public int numTrees(int n) {
	        int[] count = new int[n+1];

	        count[0] = count[1] = 1;

	        for (int i = 2; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                count[i] += count[j-1] * count[i-j];
	            }
	        }

	        return count[n];
	    }
}
