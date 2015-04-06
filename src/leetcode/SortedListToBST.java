package leetcode;
/*
 * Given a singly linked list where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 */
public class SortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		int len = 0;
		ListNode cur = head;
		while (cur != null) {
			cur = cur.next;
			len ++;
		}
		return listToBST(head, 0, len-1);
		
	}
	
	private TreeNode listToBST (ListNode head, int low, int high) {
		if (low > high) return null;
		int mid = low + (high - low)/2;
		
		TreeNode left = listToBST(head, low, mid -1);
		TreeNode root = new TreeNode(head.val);
		root.left = left;
		
		if(head.next != null) {
			head.val = head.next.val;
			head.next = head.next.next;
			root.right = listToBST(head, mid + 1, high);
		}
		return root;
	}
	
	
}
