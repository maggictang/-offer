package ��ָoffer;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 * @author Administrator
 *
 */
public class ��̨�� {
	public int JumpFloor(int target) {
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		if (target == 2) {
			return 2;
		}
		int a = 1,b = 2;
		while(target-- > 2) {
			b = a + b;
			a = b - a;
		}
		return b;
	}
}
