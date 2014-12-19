package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 3:03:12 PM
 * Dec 15, 2014
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree 
in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if (root==null){
        	return true;
        }
        if(Math.abs(getHeight(root.left) - getHeight(root.right))>1){
        	return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
	
	public int getHeight(TreeNode node){
		if(node==null){
			return 0;
		}
		int lHeight = getHeight(node.left);
		int rHeight = getHeight(node.right);
		return Math.max(lHeight, rHeight) +1;
	}
}
