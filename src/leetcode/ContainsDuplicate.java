package leetcode;

import java.util.HashSet;

/**
 * Created by 7 
 * @BayArea
 * 7:51:20 PM
 * Jun 14, 2015
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++) {
        		if (hash.contains(nums[i])){
        			return true;
        		}
        		hash.add(nums[i]);
        }
        return false;
    }
}
