package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 6:40:51 PM
 * May 3, 2015
 * Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
 */
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		int len = 0;
		ListNode cur = head;
		while (cur != null) {
			len++;
			cur = cur.next;
		}
		if (len == 0 || k % len == 0) {
			return head;
		}
		k = k % len;
		
		ListNode pre = head;
		cur = head;
		
		while (cur.next != head) {
			if (k > 0)
				k--;
			else
				pre = pre.next;
			cur = cur.next;
			if (cur.next == null)  cur.next = head;
		}
		ListNode newHead = pre.next;
		pre.next = null;
		return newHead;
	}
}
