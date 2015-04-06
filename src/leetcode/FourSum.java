package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 7 
 * @BayArea
 * 10:50:29 AM
 * Mar 9, 2015
 * 
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
 */
public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		
		for (int i = 0; i < num.length-3; i++) {
			for (int j = i+1; j < num.length-2; j++) {
				int m = j+1;
				int n = num.length-1;
				while (m < n) {
					if (num[i] + num[j] + num[m] + num[n] == target) {
						ArrayList<Integer> quadruplets = new ArrayList<Integer>();
						quadruplets.add(num[i]);
						quadruplets.add(num[j]);
						quadruplets.add(num[m]);
						quadruplets.add(num[n]);
						result.add(quadruplets);
						while (m < num.length-1 && num[m] == quadruplets.get(2))
							m++;
						while (n > 2 && num[n] == quadruplets.get(3))
							n--;
					} else if (num[i] + num[j] + num[m] + num[n] < target) {
						m++;
					} else {
						n--;
					}
				}
				while (j < num.length-2 && num[j] == num[j+1])
					j++;
			}
			while (i < num.length-3 && num[i]==num[i+1])
				i++;
		}
		return result;
	}
}
