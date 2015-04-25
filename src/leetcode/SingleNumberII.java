package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 4:08:27 PM
 * Apr 19, 2015
 * Given an array of integers, 
 * every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory?
 */
public class SingleNumberII {
	public int singleNumber(int[] A) {
		int one = 0, two = 0, three = 0;
		for (int i = 0; i< A.length; i++) {
			two |= one & A[i];
			one ^= A[i];
			three = one & two;
			one &= ~three;
			two &= ~three;
		}
		return one;
	}
}
