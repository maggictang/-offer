package ��ָoffer;

import java.util.Stack;

/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author Administrator
 *
 */
public class ������ջʵ�ֶ��� {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push(int i) {
		s1.push(i);
	}
	
	public int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int a = s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return a;
	}
}
