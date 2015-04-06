package leetcode;

import java.util.HashMap;

/*
 * Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

- Pick up the first node in the preorder list and create a tree node with the value as root;
- Look it up in the inorder list to determine the sizes of left and right subtrees;
- Recursively build up the left and right subtrees.
 */
public class BuildTreePreInorder {
	public TreeNode buildTree(int [] preorder, int[] inorder) {
		HashMap<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
		int len = inorder.length;
		if (len < 1) return null;
		
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}
		
		return buildSubTree(preorder, 0, inorderMap, 0, len -1);
		
	}
	
	private TreeNode buildSubTree(int[] preorder, int cur, HashMap<Integer,Integer> inorder, 
			int start, int end) {
		TreeNode root = new TreeNode(preorder[cur]);
		if (start < end) {
			int mid = inorder.get(preorder[cur]);
			if (mid > start) {
				root.left = buildSubTree(preorder, cur + 1, inorder, start, mid -1);
			}
			if (mid < end) {
				root.right = buildSubTree(preorder, cur+mid-start+1, inorder, mid + 1, end);
			}
		}
		return root;
	}
	
}
