package ��ָoffer;
/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 */
public class ��������˳��ʹ����λ��ż��ǰ�� {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		reOrderArray(a);
	}
	public static void reOrderArray(int[] array) {
		MyQueue q1 = new MyQueue();
		MyQueue q2 = new MyQueue();
		for(int i = 0; i < array.length; i++) {
			if((array[i] % 2) != 0) {
				//����
				q1.add(array[i]);
			}
			else {
				//ż��
				q2.add(array[i]);
			}
		}
		int a = 0;
		while(!q1.isEmpty()) {
			array[a] = q1.poll();
			a++;
		}
		while(!q2.isEmpty()) {
			array[a] = q2.poll();
			a++;
		}
	}
}
class MyQueue {
	private int first = 0;
	private int end = 0;
	private int size = 0;
	int[] array = new int[100];

	public void add(int i) {
		array[end++] = i;
		size++;
	}
	public int poll() {
		size--;
		return array[first++];
	} 
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
}