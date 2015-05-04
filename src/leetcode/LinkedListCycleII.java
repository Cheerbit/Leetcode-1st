package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 8:56:37 PM
 * May 3, 2015
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?
 */
public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next.next!=null) {
        		slow = slow.next;
        		fast = fast.next.next;
        		if(slow == fast) {
        			break;
        		}
        }
        if (fast == null || fast.next == null) {
        		return null;
        }
        
        slow = head;
        while (slow != fast) {
        		slow = slow.next;
        		fast = fast.next;
        }
        return slow;
    }
}
