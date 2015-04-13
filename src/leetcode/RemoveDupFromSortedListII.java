package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 10:52:51 AM
 * Apr 6, 2015
 * Given a sorted linked list, delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDupFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode pre = null, cur = head;
		while (cur != null && cur.next!= null) {
			if (cur.val != cur.next.val) {
				pre = cur;
			} else {
				while(cur.next != null && cur.val == cur.next.val) {
					cur.next = cur.next.next;
				}
				if (pre == null)
					head = cur.next;
				else
					pre.next = cur.next;
			}
			cur = cur.next;
		}
		return head;
	}
}
