package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 9:26:02 PM
 * May 3, 2015
 * Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < nums.length; i++) {
        		sum += nums[i];
        		max = Math.max(sum, max);
        		if (sum < 0) sum = 0;
        }
        return max;
    }
}
