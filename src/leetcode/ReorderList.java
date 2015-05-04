package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 9:46:38 PM
 * May 3, 2015
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class ReorderList {
	public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
		ListNode slow = head;
        ListNode fast = head;
        
        while(fast!= null && fast.next!= null && fast.next.next!= null) {
        		slow = slow.next;
        		fast = fast.next.next;
        }
        
        ListNode second = slow.next;
        slow.next = null;
        
        second = reverse(second);
        
        ListNode l1 = head;
        ListNode l2 = second;
        
        while (l2 != null) {
        		ListNode temp1 = l1.next;
        		ListNode temp2 = l2.next;
        		
        		l1.next = l2;
        		l2.next = temp1;
        		
        		l1 = temp1;
        		l2 = temp2;
        		
        }
        
    }
	
	public ListNode reverse(ListNode head) {
		ListNode cur = head;
		ListNode next = null;
		ListNode pre = null;
		
		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
}
