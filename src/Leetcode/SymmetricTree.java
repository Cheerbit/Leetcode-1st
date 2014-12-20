package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 7:16:48 PM
 * Dec 19, 2014
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {
	private boolean isSymmetric(TreeNode left, TreeNode right){
		if(left==null && right == null) return true;
		if(left ==null || right ==null || left.val!=right.val) return false;
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}
	public boolean isSymmetric(TreeNode root) {
        return (root==null) || isSymmetric(root.left,root.right);
    }
	
	
}
