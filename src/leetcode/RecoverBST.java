package leetcode;

import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 7:39:06 PM
 * May 9, 2015
 * Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

Note:
A solution using O(n) space is pretty straight forward. C
ould you devise a constant space solution?
 */
public class RecoverBST {
	private void swap(TreeNode a, TreeNode b) {
		if (a == null || b== null) return;
		int tmp = a.val;
		a.val = b.val;
		b.val = tmp;		
	}
	
	public void recoverTree(TreeNode root) {
        TreeNode cur = root, pre = null, first = null, second = null;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (cur != null) {
        		stack.push(cur);
        		cur = cur.left;
        }
        
        while (!stack.isEmpty()) {
        		cur = stack.pop();
        		
        		if (pre != null && cur.val < pre.val) {
        			if (first == null) {
        				first = pre;
        				second = cur;
        			} else {
        				second = cur;
        				break;
        			}
        		}
        		
        		pre = cur;
        		cur = cur.right;
        		while (cur != null) {
        			stack.push(cur);
        			cur = cur.left;
        		}
        }
        swap(first, second);
        
    }
}
