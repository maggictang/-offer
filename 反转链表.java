package ��ָoffer;

import util.ListNode;

/**
 * ����һ��������ת�����������������Ԫ�ء�
 * @author Administrator
 *
 */
public class ��ת���� {
	
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
