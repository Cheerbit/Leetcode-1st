package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 6:57:54 PM
 * Dec 19, 2014
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path 
from the root node down to the farthest leaf node.
 */
public class MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) +1;
    }
}
