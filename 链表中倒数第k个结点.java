package ��ָoffer;

import java.util.Stack;

/**
 * ����һ����������������е�����k����㡣
 * @author Administrator
 *
 */
public class �����е�����k����� {
	
	public ListNode1 FindKthToTail(ListNode1 head,int k) {
		if(head == null) {
            return null;
        }
        Stack<ListNode1> stack = new Stack<>();
        int a = 0;
		while(head != null) {
			stack.push(head);
            head = head.next;
            a++;
		}
        if(k > a) {
            return null;
        }
		while(k-- > 0) {
			head = stack.pop();
		}	
		return head;
	}
}

class ListNode1 {
	int val;
	ListNode1 next = null;

	ListNode1(int val) {
		this.val = val;
	}
}