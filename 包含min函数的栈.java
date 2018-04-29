package 剑指offer;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author Administrator
 *
 */
public class 包含min函数的栈 {
	
	//数组实现
	int[] arr;
	//栈顶指针
	int top;
	//栈大小
	int size;
	
	public 包含min函数的栈() {
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