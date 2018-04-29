package 剑指offer;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 * @author Administrator
 *
 */
public class 斐波那契数列 {
	
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
