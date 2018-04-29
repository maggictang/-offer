package 剑指offer;

import java.util.Arrays;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class 二叉搜索树的后序遍历序列 {
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
			//找到左子树的索引
			if(sequence[indext] > root) {
				break;
			}
		}
		//遍历右子树。
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
		//如果还有左子树
		if (left != null && left.length > 1) {
			return VerifySquenceOfBST(left);
		}
		//如果还有右子树
		if (right != null &&right.length > 1) {
			return VerifySquenceOfBST(right);
		}
		return true;
	}
}
