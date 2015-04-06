package leetcode;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by 7 
 * @BayArea
 * 4:37:04 PM
 * Apr 5, 2015
 * Given a set of distinct integers, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,3], a solution is: [[3],[1], [2], [1,2,3], [1,3], [2,3], [1,2], []]
 */
public class Subsets {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		Arrays.sort(S);
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		results.add(new ArrayList<Integer>());
		for (int i = 0; i < S.length; i++) {
			int curSize = results.size();
			while (curSize-- > 0) {
				ArrayList<Integer> res = new ArrayList<Integer>(results.get(curSize));
				res.add(S[i]);
				results.add(res);
			}
		}
		return results;
	}
}
