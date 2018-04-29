package 剑指offer;

import util.ListNode;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * @author Administrator
 *
 */
public class 反转链表 {
	
	public static ListNode ReverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while(head != null) {
			next = head.next;
			head.next = pre;
			
			pre = head;
			head = next;
		
		}
		return pre;
	}
}
