package 剑指offer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author Administrator
 *
 */
public class 数值的整数次方 {
	public double Power(double base, int exponent) {
		int n = 1;
		for(int i = 0; i < abs(exponent); i++) {
			n *= base;
		}
		if (exponent < 0) {
			n = 1 / n;
		}
		return n;
	}

	private int abs(int exponent) {
		return exponent > 0 ? exponent : -exponent;
	}
	
	
}
