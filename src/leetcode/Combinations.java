package leetcode;

import java.util.ArrayList;

/**
 * Created by 7
 * 
 * @BayArea 10:18:31 AM Apr 14, 2015 Given two integers n and k, return all
 *          possible combinations of k numbers out of 1 ... n.
 * 
 *          For example, If n = 4 and k = 2, a solution is:
 * 
 *          [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4], ]
 */
public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		combineHelper(1, n, k, new ArrayList<Integer>(), res);
		return res;
	}

	private void combineHelper(int s, int n, int k, ArrayList<Integer> path,
			ArrayList<ArrayList<Integer>> res) {
		if (n == 0) return;
		if (k == 0) {
			ArrayList<Integer> r = new ArrayList<Integer>(path);
			res.add(r);
			return;
		}
		
		for (int i = s; i <= n-k+1; i++) {
			path.add(i);
			combineHelper(i+1, n, k-1, path, res);
			path.remove(path.size()-1);
		}
	}
	
	public ArrayList<ArrayList<Integer>> combine2(int n, int k) {
		ArrayList<ArrayList<Integer>> resSet = new ArrayList<ArrayList<Integer>>();
		if (k == 1) {
			for (int i = 0; i<=n; i++) {
				ArrayList<Integer> res = new ArrayList<Integer>();
				res.add(i);
				resSet.add(res);
			}
			return resSet;
		}
		
		for (int i = n; i>=k; i--) {
			ArrayList<ArrayList<Integer>> results = combine(i-1, k-1);
				for (ArrayList<Integer> res : results) {
					res.add(i);
					resSet.add(res);
				}
		}
		return resSet;
	}
	
	
	
}
