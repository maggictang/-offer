package ��ָoffer;

/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * @author Administrator
 *
 */
public class ���θ��� {
	public int RectCover(int target) {
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		int a = 1,b = 1;
		if (target-- > 1) {
			b = a + b;
			a = b - a;
		}
		return b;

	}
}
