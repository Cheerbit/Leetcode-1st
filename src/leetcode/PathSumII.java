package leetcode;

import java.util.ArrayList;

/*
 * Given a binary tree and a sum, 
 * find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
*/
public class PathSumII {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		findPathSum(root, sum, new ArrayList<Integer>(), res);
		return res;
	}
	
	private void findPathSum(TreeNode root, int sum, 
			ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
		if (root == null) return;
		path.add(root.val);
		if(root.left == null && root.right == null) {
			if(sum == root.val) {
				ArrayList<Integer> curPath = new ArrayList<Integer>(path);
				res.add(curPath);
			}
		}
		findPathSum(root.left, sum - root.val, path, res);
		findPathSum(root.right, sum - root.val, path, res);
		path.remove(path.size()-1);
		
	}
}
