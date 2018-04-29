package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

import util.ListNode;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author Administrator
 *
 */
public class 从尾到头打印链表 {

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

