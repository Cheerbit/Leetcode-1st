package leetcode;

import java.util.Arrays;

/**
 * Created by 7 
 * @BayArea
 * 7:12:38 PM
 * May 5, 2015
 * Given an unsorted array, 
 * find the maximum difference 
 * between the successive elements in its sorted form.

Try to solve it in linear time/space.

Return 0 if the array contains less than 2 elements.

You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.


 */
public class MaximumGap {
	 public int maximumGap(int[] nums) {
	        if (nums.length <=1) {
	        	return 0;
	        }        
	        Arrays.sort(nums);
	        
	        int maxGap = 0;
	        for (int i = 1; i< nums.length; i ++) {
	        		int curGap = nums[i] - nums[i-1];
	        		if (curGap > maxGap) maxGap = curGap;
	        }
	        return maxGap;
	    }
}
