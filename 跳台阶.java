package 剑指offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author Administrator
 *
 */
public class 跳台阶 {
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
