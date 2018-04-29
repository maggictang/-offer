package ��ָoffer;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * @author Administrator
 *
 */
public class ջ��ѹ�뵯������ {
	public static void main(String[] args) {
		IsPopOrder(new int[]{1,2,3,4,5},new int[]{4,3,5,1,2});
	}
	
	public static boolean IsPopOrder(int[] pushA,int[] popA) {
		if (pushA.length ==0 || popA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int popIndex = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while(!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				stack.pop();
				popIndex++;
			}
		}
		return stack.isEmpty();
	}
}
