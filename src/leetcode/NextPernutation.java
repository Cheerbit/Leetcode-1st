package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 5:20:27 PM
 * Apr 19, 2015
 * Implement next permutation, 
 * which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, 
it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
 */
public class NextPernutation {
//Find the longest descending tail of the array and reverse them into ascending order.
//If there is any number ahead of the descending tail, 
//it should be replace with the first greater number in the tail.
	private void swap(int[] num, int a, int b) {
		int tmp = num[a];
		num[a] = num[b];
		num[b] = tmp;
	}
	
	private void reverse(int[] num, int l, int r) {
		while (l < r) swap(num, l++, r--);
	}
	
	public void nextPermutation(int[] num) {
		int cur = num.length - 1;
		while (cur > 0 && num[cur-1] >= num[cur]) cur--;
		reverse(num, cur, num.length-1);
		if(cur > 0) {
			int next = cur;
			cur -= 1;
			while (num[next] <= num[cur]) next++;
			swap(num, next, cur);
		}
	}


}
