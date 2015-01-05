package Leetcode;

/**
 * Created by 7 
 * @BayArea
 * 1:12:38 AM
 * Dec 24, 2014
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {
	public int maxProduct(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int maxProduct = A[0];
		int max = A[0];
		int min = A[0];
		
		for (int i = 1; i < A.length; i++) {
			int a = A[i] * max;
			int b = A[i] * min;
			max = Math.max(Math.max(a, b), A[i]);
			min = Math.min(Math.min(a, b), A[i]);
			maxProduct = Math.max(maxProduct, max);
		}
		return maxProduct;
		
	}
}
