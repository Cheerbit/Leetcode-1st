package leetcode;

import java.util.Arrays;

/**
 * Created by 7 
 * @BayArea
 * 8:35:13 PM
 * May 5, 2015
 * Given an unsorted array of integers, 
 * find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {
	 public int longestConsecutive(int[] nums) {
	        if (nums.length <=1 ) return nums.length;
	        Arrays.sort(nums);
	        int maxLen = 1;
	        int curLen = 1;
	        for (int i = 1; i < nums.length; i++) {
	        		if (nums[i] - nums[i-1] == 1) {
	        			curLen++;
	        			maxLen = Math.max(curLen, maxLen);
	        		} else if (nums[i] - nums[i-1] == 0){
	        			continue;
	        		} else {
	        			curLen = 1;
	        		}
	        }
	        return maxLen;
	    }
}
