package ��ָoffer;

/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author Administrator
 *
 */
public class ��ת�������С���� {
	public int minNumberInRotateArray(int[] array) {
		if(array.length == 0) {
			return 0;
		}
		int lo = 0, hi = array.length;
		while(hi > lo) {
			int mid = (hi - lo) >> 1;
			if(array[mid] > array[hi-1]) {
				lo = mid + 1;
			}
			else if(array[mid] == array[hi]) {
				hi--;
			}
			else {
				hi = mid;
			}
		}
		return array[lo];
	}
}
