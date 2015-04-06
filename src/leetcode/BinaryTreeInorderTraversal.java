package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 4:11:27 PM
 * Mar 21, 2015
 * Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].


 */
public class BinaryTreeInorderTraversal {
	public ArrayList<Integer> inorder(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		
		while (current != null) {
			stack.push(current);
			current = current.left;
		}
		
		while (!stack.isEmpty()) {
			current = stack.pop();
			result.add(current.val);
			current = current.right;
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
		}
		return result;
		
	}
	
	public ArrayList<Integer> inorderTraversalR(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		help(result, root);
		return result;
	}
	
	public void help(ArrayList<Integer> result, TreeNode node) {
		if (node == null) {
			return;
		}
		
		help(result, node.left);
		result.add(node.val);
		help(result,node.right);
		
	}
}
