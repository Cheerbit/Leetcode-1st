package Leetcode;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Created by 7 
 * @Buffalo
 * 1:46:30 AM
 * Dec 15, 2014
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along 
the shortest path from the root node down to the nearest leaf node.
 */

/*
 * on average, BFS will perform better:
BFS can stop as soon as it hits the first leaf and return the depth there.
 */
public class MinDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        } else if (root.left != null) {
            return minDepth(root.left) + 1;
        } else {
            return minDepth(root.right) + 1;
        }
    }
}

