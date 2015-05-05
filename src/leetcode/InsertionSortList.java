package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 8:56:34 PM
 * May 4, 2015
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
	    if(head == null)
	        return null;
	    ListNode dummy = new ListNode(0);
	    ListNode pre = dummy;
	    ListNode cur = head;
	    while(cur!=null)
	    {
	        ListNode next = cur.next;
	        pre = dummy;
	        while(pre.next!=null && pre.next.val<=cur.val)
	        {
	            pre = pre.next;
	        }
	        cur.next = pre.next;
	        pre.next = cur;
	        cur = next;
	    }
	    return dummy.next;
	}
}
