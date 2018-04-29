package 剑指offer;

import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author Administrator
 *-
 */
public class 二叉搜索树与双向链表 {
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
