package ��ָoffer;

/**
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * @author Administrator
 *
 */
public class ��ֵ�������η� {
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
