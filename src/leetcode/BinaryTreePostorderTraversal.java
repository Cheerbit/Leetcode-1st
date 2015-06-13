package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 1:48:40 PM
 * Jun 6, 2015
 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
Postorder is to visit nodes in a left-right-root order, recursively. 
Recall that preorder is root-left-right. 
If we visit the nodes in a "mirrored preorder", 
that is, root-right-left, and store the values in a stack. 
After we finish the traversal, pop out values in the stack would give us left-right-root, 
which is exactly a postorder traversal!
 */
public class BinaryTreePostorderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<TreeNode> stackBack = new Stack<TreeNode>();
        Stack<Integer> stack = new Stack<Integer>();
        TreeNode cur = root;
        
        while (cur != null) {
        		stack.push(cur.val);
        		stackBack.push(cur);
        		cur = cur.right;
        }
        while (!stackBack.empty()) {
        		cur = stackBack.pop();
        		cur = cur.left;
        		while (cur != null) {
        			stack.push(cur.val);
        			stackBack.push(cur);
        			cur = cur.right;
        		}
        }
        while (!stack.empty()) {
        		res.add(stack.pop());
        }
        return res;
    }

}
