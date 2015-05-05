package leetcode;
/*
 * Sort a linked list in O(n log n) time using constant space complexity.
 */

public class SortList {
	 public ListNode sortList(ListNode head) {
	        if (head == null || head.next == null)
	        	return head;
	        
	        ListNode slow = head;
	        ListNode fast = head;
	        
	        while (fast != null && fast.next != null && fast.next.next != null) {
	        		slow = slow.next;
	        		fast = fast.next.next;
	        }
	        ListNode second = slow.next;
	        slow.next = null;
	        
	        head = sortList(head);
	        second = sortList(second);
	        return merge(head, second);
	        
	    }
	
	private ListNode merge(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode current = head;
		
		while (l1 != null || l2 != null) {
			if ( l2 == null || l1 != null && l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			
			current = current.next;
		}
		return head.next;
	}
}
