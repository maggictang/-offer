package ��ָoffer;

/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * @author Administrator
 *
 */
public class ��������1�ĸ��� {
	public int NumberOf1(int n) {
		int count = 0;
		while(n != 0) {
			++count;
			n = n & (n-1);
		}
		return count;
	}
}
