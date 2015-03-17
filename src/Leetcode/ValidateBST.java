package Leetcode;

import java.util.Stack;

/**
 * Created by 7
 * 
 * @BayArea 5:04:24 PM Mar 16, 2015 Given a binary tree, determine if it is a
 *          valid binary search tree (BST).
 * 
 *          Assume a BST is defined as follows:
 * 
 *          The left subtree of a node contains only nodes with keys less than
 *          the node's key. The right subtree of a node contains only nodes with
 *          keys greater than the node's key. Both the left and right subtrees
 *          must also be binary search trees.
 */
public class ValidateBST {
	public boolean isValidBST(TreeNode root) {
		TreeNode cur = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (cur != null) {
			stack.push(cur);
			cur = cur.left;
		}
		TreeNode pre = null;
		while (!stack.empty()) {
			cur = stack.pop();
			if (pre != null && pre.val >= cur.val)
				return false;
			pre = cur;
			cur = cur.right;
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
		}
		return true;
	}

}
