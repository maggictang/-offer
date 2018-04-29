package 剑指offer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author Administrator
 *
 */
public class 顺时针打印矩阵 {
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		printMatrix(a);
	}
	
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		//数组行数
		int num = matrix[0].length * matrix.length;
		while(num != 0) {
			for(int i = 0; i < matrix[0].length; i++) {
				list.add(matrix[0][i]);
				num--;
			}
			//旋转数组
			matrix = revert(matrix);
		}
		return list;
	}

	private static int[][] revert(int[][] matrix) {
		if(matrix.length < 2) {
			return matrix;
		}
		//新数组要删除第一行
		int[][] arr = new int[matrix[0].length][matrix.length-1];
		//旋转数组
		for(int i = 0; i < matrix.length-1; i++) {
			for (int j = matrix[i+1].length - 1; j >=0; j--) {
				arr[j][i] = matrix[i+1][matrix[i].length-j-1];
			}
		}	
		return arr;
	}
}
