package ��ָoffer;

/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * @author Administrator
 *
 */
public class ����min������ջ {
	
	//����ʵ��
	int[] arr;
	//ջ��ָ��
	int top;
	//ջ��С
	int size;
	
	public ����min������ջ() {
		arr = new int[10];
		top = -1;
	}
	
	public void push(int node) {
		arr[++top] = node;
		size++;
	}

	public void pop() {
		top--;
		size--;
	}

	public int top() {
		return arr[top];
	}

	public int min() {
		int min = arr[0];
		for(int i = 0; i < size; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}