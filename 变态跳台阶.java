package ��ָoffer;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author Administrator
 *
 */
public class ��̬��̨�� {
	public int JumpFloorII(int target) {
		if (target == 1) {
			return 1;
		}
		int a = 2 * JumpFloorII(target - 1);	
		return a;		
	}
}
