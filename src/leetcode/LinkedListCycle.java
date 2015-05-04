package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 8:31:23 PM
 * May 3, 2015
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!=null) {
        		slow = slow.next;
        		fast = fast.next.next;
        		if(slow == fast) {
        			return true;
        		}
        }
        return false;
    }
}
