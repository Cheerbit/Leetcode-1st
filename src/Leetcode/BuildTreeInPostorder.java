package Leetcode;

import java.util.HashMap;

/*
 * Given inorder and postorder traversal of a tree, construct the binary tree.
Note: You may assume that duplicates do not exist in the tree.

Notice that postorder visits nodes in a tree in a left->right->root order. 
If we read postorder list backwards, it gives us a root->right->left order, 
which is kind of  a "mirror-like" way of preorder (root->left->right) traversal. 
Thus, several small modifications of previous algorithm can solve this problem, as shown below.
 */
public class BuildTreeInPostorder {
	public TreeNode buildTree(int [] inorder, int[] postorder) {
		int len = inorder.length;
		if( len == 0 || len != postorder.length) return null;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i< len; i++) {
			map.put(inorder[i], i);
		}
		return buildSubTree(postorder, len-1, map, 0, len -1);
	}
	
	private TreeNode buildSubTree(int[] postorder, int cur,   
			HashMap<Integer,Integer> inorder, int start, int end) {
		if (start > end) return null; //base case
		
		int val = postorder[cur];
		TreeNode root = new TreeNode(val);
		int mid = inorder.get(val);
		// read postorder values backwards
		root.left = buildSubTree(postorder, cur-(end-mid)-1, inorder, start, mid-1);
		root.right = buildSubTree(postorder, cur-1, inorder, mid+1, end);
		return root;
	}
}
