package ��ָoffer;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author Administrator
 *
 */
public class ˳ʱ���ӡ���� {
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		printMatrix(a);
	}
	
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		//��������
		int num = matrix[0].length * matrix.length;
		while(num != 0) {
			for(int i = 0; i < matrix[0].length; i++) {
				list.add(matrix[0][i]);
				num--;
			}
			//��ת����
			matrix = revert(matrix);
		}
		return list;
	}

	private static int[][] revert(int[][] matrix) {
		if(matrix.length < 2) {
			return matrix;
		}
		//������Ҫɾ����һ��
		int[][] arr = new int[matrix[0].length][matrix.length-1];
		//��ת����
		for(int i = 0; i < matrix.length-1; i++) {
			for (int j = matrix[i+1].length - 1; j >=0; j--) {
				arr[j][i] = matrix[i+1][matrix[i].length-j-1];
			}
		}	
		return arr;
	}
}
