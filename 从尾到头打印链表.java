package ��ָoffer;

import java.util.ArrayList;
import java.util.Stack;

import util.ListNode;

/**
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 * @author Administrator
 *
 */
public class ��β��ͷ��ӡ���� {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<ListNode> stack = new Stack<>();
		while(listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while(!stack.isEmpty()) {
			list.add(stack.pop().val);
		}
		return list;
	}
}

