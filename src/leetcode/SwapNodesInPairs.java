package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 10:45:26 AM
 * Apr 12, 2015
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. 
You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = dummy;
		
		while (cur.next != null && cur.next.next != null) {
			ListNode tmp = cur.next;
			cur.next = cur.next.next;
			cur = cur.next;
			tmp.next = cur.next;
			cur.next = tmp;
			cur = cur.next;
		}
		
		return dummy.next;
	}
	
	
}
