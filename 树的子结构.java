package ��ָoffer;

import java.util.Stack;

/**
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * @author Administrator
 *
 */

public class �����ӽṹ {
	
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1 == null || root2 == null) {
			return false;
		}
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Stack<TreeNode> stack = new Stack<>();
		//�������A��
		preOrder(root1,stack,sb1);
		//�������B��
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
