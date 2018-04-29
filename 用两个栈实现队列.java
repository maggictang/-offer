package 剑指offer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author Administrator
 *
 */
public class 用两个栈实现队列 {
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
