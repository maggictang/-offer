package ��ָoffer;

/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�n<=39
 * @author Administrator
 *
 */
public class 쳲��������� {
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(39));
	}
	
	public static int Fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		int a = 0,b = 1;
		while(n-- > 1) {
			b = a + b;
			a = b - a;
		}
		return b;
	}
}
