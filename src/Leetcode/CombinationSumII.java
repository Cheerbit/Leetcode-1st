package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 7 
 * @BayArea
 * 9:00:06 PM
 * Dec 23, 2014
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
A solution set is: 
[1, 7] 
[1, 2, 5] 
[2, 6] 
[1, 1, 6] 
 * 
 */
public class CombinationSumII {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) { 
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(candidates);
		addUp(candidates, 0, target, new ArrayList<Integer>(), results);
		return results;
	}
	
	private void addUp(int[] candidates, int start, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> results) {
		if (start < 0 || target < 0) return;
		if (target == 0) {
			ArrayList<Integer> res = new ArrayList<Integer>(path);
			results.add(res);
		} else {
			for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
				if( i > start && candidates[i] == candidates[i-1]) continue;
				path.add(candidates[i]);
				addUp(candidates, i+1, target - candidates[i], path, results);
				path.remove(path.size() - 1);
			}
		}
	}
	
	
}
