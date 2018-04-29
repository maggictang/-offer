package ��ָoffer;

import java.util.Stack;

/**
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * @author Administrator
 *-
 */
public class ������������˫������ {
	public TreeNode Convert(TreeNode pRootOfTree) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = pRootOfTree;
		TreeNode pre = null;
		boolean isFirst = true;
		while(p != null || !stack.isEmpty()) {
			while (p != null) {
				stack.push(p);
				p = p.left;
			}
			p = stack.pop();
			if (isFirst) {
				pRootOfTree = p;
				pre = p;
				isFirst = false;
			}
			else {
				pre.right = p;
				p.left = pre;
				pre = p;
			}
			p = p.right;
		}
		return pRootOfTree;
	}
}
