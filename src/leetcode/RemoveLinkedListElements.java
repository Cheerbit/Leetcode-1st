package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 7:57:23 PM
 * Jun 14, 2015
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5


 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {  
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        while (pre.next != null) {
        		if (pre.next.val == val) {
        			pre.next = pre.next.next;
        		} else {
        			pre = pre.next;
        		}
        }
        
        return dummy.next;
    }
}
