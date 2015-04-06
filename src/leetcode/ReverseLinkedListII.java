package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 5:08:04 PM
 * Mar 21, 2015
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 */
public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null || m==n) return head;
		
		ListNode start = head, before = null;
		
		for (int i = 1; i< m; i++) { 
			before = start;
			start = start.next;
		}
		
		ListNode current = start, prev = null, next = null;
		
		for (int i = 0; i < n-m+1; i++) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		start.next = current;
		if (m == 1) return prev;
		before.next = prev;
		return head;
	}
}
