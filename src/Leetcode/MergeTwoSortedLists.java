package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 1:24:26 PM
 * Dec 21, 2014
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        
        while(l1 != null || l2 != null){
        		if(l2 == null || l1 != null && l1.val <= l2.val){
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
