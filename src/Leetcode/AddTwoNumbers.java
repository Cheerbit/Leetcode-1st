package Leetcode;

/**
 * Created by 7 
 * @BayArea
 * 1:16:27 AM
 * Jan 6, 2015
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        int carry = 0;
        ListNode head = null, cur = null;
        while (l1 != null || l2 != null) {
        	int sum = carry;
        	if (l1 != null) {
        		sum += l1.val;
        		l1 = l1.next;
        	}
        	if (l2 != null) {
        		sum += l2.val;
        		l2 = l2.next;
        	}
        	if (cur == null) { //first node
        		cur = new ListNode(sum % 10);
        		head = cur;
        	} else {
        		cur.next = new ListNode(sum % 10);
        		cur = cur.next;
        	}
        	carry = sum / 10;
        }
        
        if (carry > 0) cur.next = new ListNode(carry);
        return head;
    }
}
