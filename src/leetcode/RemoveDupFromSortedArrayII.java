package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 2:01:24 PM
 * Apr 13, 2015
 * Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class RemoveDupFromSortedArrayII {
	public int removeDuplicates(int[] A) {
		int count = 0;
		for (int i = 2; i< A.length; i++) {
			if (A[i] == A[i-count-1] && A[i] == A[i-count-2]) {
				count++;
			} else if (count > 0) {
				A[i-count] = A[i];
			}
		}
		return A.length - count;
	}
}
