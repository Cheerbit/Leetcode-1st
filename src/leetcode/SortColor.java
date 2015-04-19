package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 9:22:59 PM
 * Apr 16, 2015
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, 
 * with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
 */
public class SortColor {
	 private static final int RED = 0;  
	 private static final int WHITE = 1;  
	 private static final int BLUE = 2;  
	   
	private void swap(int[] A, int l, int r) {
		int tmp = A[l];
		A[l] = A[r];
		A[r] = tmp;
	}
	
	public void sortColors(int[] colors) {
		int cur = 0;
		int red = 0, blue = colors.length - 1;
		while (cur <= blue) {
			if (colors[cur] == RED) {
				swap(colors, cur++, red++);
			} else if (colors[cur] == BLUE) {
				swap(colors, cur, blue--);
			} else {
				cur++;
			}
		}
	}
}
