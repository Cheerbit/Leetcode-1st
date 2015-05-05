package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 8:18:54 PM
 * May 4, 2015
 */
public class BinaryTreePreorderTraversal {
	 public ArrayList<Integer> preorderTraversal(TreeNode root) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        if (root == null) return result;
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode current = root;
	        
	        while (current != null) {
	        		result.add(current.val);
	        		stack.push(current);
	        		current = current.left;
	        }
	        
	        while (!stack.empty()) {
	        		current = stack.pop();
	        		current = current.right;
	        		while (current != null) {
	        			result.add(current.val);
	        			stack.push(current);
	        			current = current.left;
	        		}
	        }
	        return result;
	        
	    }
	 public ArrayList<Integer> preorderTraversalR(TreeNode root) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			help(result, root);
			return result;
		}
		
		public void help(ArrayList<Integer> result, TreeNode node) {
			if (node == null) {
				return;
			}
			result.add(node.val);
			help(result, node.left);
			help(result, node.right);
			
		}
}
