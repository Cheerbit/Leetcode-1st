package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 10:46:34 AM
 * Feb 6, 2015
 * Given a binary tree, return the zigzag level order traversal of its nodes' valuesCX          BBBBBBBBBBBBBBBBBB		7777777U8,.... (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]

 */
public class BinaryTreeZigzagLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> resSet = new ArrayList<ArrayList<Integer>>();
		if (root == null) return resSet;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		boolean oddLevel = false;
		while (!stack.isEmpty()) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			Stack<TreeNode> stackTmp = new Stack<TreeNode>();
			while(!stack.isEmpty()) {
				TreeNode cur = stack.pop();
				res.add(cur.val);
				if (oddLevel) {
					if (cur.right != null) stackTmp.push(cur.right);
					if (cur.left != null) stackTmp.push(cur.left);
				} else {
					if (cur.left != null) stackTmp.push(cur.left);
					if (cur.right != null) stackTmp.push(cur.right);
				}
				
			}
			resSet.add(res);
			stack = stackTmp;
			oddLevel = !oddLevel;
		}
		return resSet;
		
	}
}
