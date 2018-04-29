package 剑指offer;

import java.util.Stack;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author Administrator
 *
 */

public class 树的子结构 {
	
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1 == null || root2 == null) {
			return false;
		}
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Stack<TreeNode> stack = new Stack<>();
		//先序遍历A树
		preOrder(root1,stack,sb1);
		//先序遍历B树
		preOrder(root2, stack, sb2);
		return sb1.toString().contains(sb2.toString());
		
	}

	private static void preOrder(TreeNode root1, Stack<TreeNode> stack, StringBuilder sb1) {
		stack.push(root1);
		while(!stack.isEmpty()) {
			TreeNode tn = stack.pop();
			sb1.append(tn.val);
			if (tn.right != null) {
				stack.push(tn.right);
			}
			if (tn.left != null) {
				stack.push(tn.left);
			}
		}
	}

	
}
