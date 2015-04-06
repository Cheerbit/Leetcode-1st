package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 3:45:26 PM
 * Dec 14, 2014
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical 
and the nodes have the same value.
 */
public class SameTree {
	
	public boolean isSameTreeRecur(TreeNode p, TreeNode q) {
        if(p ==null && q ==null) return true;
        
        if(p ==null || q ==null || p.val!=q.val) return false;
        
        return isSameTreeRecur(p.left,q.left) && isSameTreeRecur(p.right,q.right);
    }
	
//	public boolean isSameTree(TreeNode p, TreeNode q){
//		
//	}
}

class TreeNode {
	 int val;
     TreeNode left;
	 TreeNode right;
	 TreeNode(int x) 
	 { val = x; }
	  }
