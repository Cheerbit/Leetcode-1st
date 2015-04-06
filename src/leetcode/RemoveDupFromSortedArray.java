package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 11:02:52 AM
 * Dec 20, 2014
 * Given a sorted array, remove the duplicates in place 
 * such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
 */

/*
 * Maintaining count of duplicates and copy over non-duplicates directly to the right spot.
 */
public class RemoveDupFromSortedArray {
	public int removeDuplicates(int[] A){
		int count=0;
		for(int i=1; i<A.length; i++){
			if(A[i] == A[i-1]){
				count++;
			}else if(count>0){
				A[i-count] =A[i];
			}
		}
		return A.length-count;
	}
}
