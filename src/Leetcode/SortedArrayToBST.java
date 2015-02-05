package Leetcode;
/*
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] num) {
		return arrayToBST(num, 0, num.length-1);
	}
	
	private TreeNode arrayToBST(int[] data, int low, int high) {
		if(low > high) return null;
		int mid = low + (high - low)/2;
		TreeNode root = new TreeNode(data[mid]);
		root.left = arrayToBST(data, low, mid -1);
		root.right = arrayToBST(data, mid+1, high);
		return root;
	}
}

