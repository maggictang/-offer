package 剑指offer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class 二维数组中的查找 {
	
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
