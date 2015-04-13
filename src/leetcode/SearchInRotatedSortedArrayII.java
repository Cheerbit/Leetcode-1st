package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 2:04:17 PM
 * Apr 12, 2015
 * Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?

Write a function to determine if a given target is in the array.
 */
public class SearchInRotatedSortedArrayII {
	public static boolean search(int[] A, int target) {		
		int start = 0, end = A.length - 1;
		while (start <= end) {
			int mid = (start + end)/2;
			if (A[mid] == target) {
				return true;
			}
			if (A[start] == A[mid]) {
				if (A[mid] == A[end]) {
					for (int i = start +1; i < end; i++) {
						if (A[i] == target)
							return true;
					}
					return false;
				} else {
					start = mid +1;
				}
			} else if (A[start] < A[mid]) {
				if (A[start] <= target && target < A[mid]){
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (A[mid] < target && target <= A[end]) {
					start = mid + 1;
				} else {
					end = mid -1;
				}
			}
			
		}
		return false;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[3];
		A[0] = 3;
		A[1] = 1;
		A[2] = 1;
		System.out.println(search(A, 3));
	}
}
