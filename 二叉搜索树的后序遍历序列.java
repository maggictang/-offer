package ��ָoffer;

import java.util.Arrays;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 */
public class �����������ĺ���������� {
	public static void main(String[] args) {
		System.out.println(VerifySquenceOfBST(new int[]{1,2,3,4,5}));
	}
	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		int arrSize = sequence.length;
		int root = sequence[arrSize-1];
		int indext = 0;
		for (; indext < arrSize; indext++) {
			//�ҵ�������������
			if(sequence[indext] > root) {
				break;
			}
		}
		//������������
		for (int i = indext; i < arrSize; i++) {
			if (sequence[i] < root) {
				return false;
			}
		}
		int[] left = null;
		int[] right = null;
		if(indext < arrSize) {
			left = Arrays.copyOfRange(sequence, 0, indext);
			right = Arrays.copyOfRange(sequence, indext+1, arrSize); 
		}
		//�������������
		if (left != null && left.length > 1) {
			return VerifySquenceOfBST(left);
		}
		//�������������
		if (right != null &&right.length > 1) {
			return VerifySquenceOfBST(right);
		}
		return true;
	}
}
