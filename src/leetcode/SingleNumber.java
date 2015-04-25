package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 11:15:03 AM
 * Apr 19, 2015
 * Given an array of integers, every element appears twice except for one. 
 * Find that single one.

Note:
Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory?
 */
public class SingleNumber {
	public int singleNumber(int[] A) {
		if (A.length == 1) {
			return A[0];
		}
		
		int result = A[0];
		for (int i = 1; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
		
	}
}
