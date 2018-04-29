package 剑指offer;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class 调整数组顺序使奇数位于偶数前面 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		reOrderArray(a);
	}
	public static void reOrderArray(int[] array) {
		MyQueue q1 = new MyQueue();
		MyQueue q2 = new MyQueue();
		for(int i = 0; i < array.length; i++) {
			if((array[i] % 2) != 0) {
				//奇数
				q1.add(array[i]);
			}
			else {
				//偶数
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