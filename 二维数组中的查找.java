package ��ָoffer;

/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class ��ά�����еĲ��� {
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		boolean b = Find(10, a);
		System.out.println(b);
	}

	public static boolean Find(int target, int [][] array) {
		int i = array[0].length-1;
		int j = 0;
		for (; i >= 0 && j < array.length;) {
			if (array[j][i] == target) {
				return true;
			}
			if (array[j][i] < target) {
				j++;
			}
			else {
				i--;
			}
		}
		return false;
		
	}
}
