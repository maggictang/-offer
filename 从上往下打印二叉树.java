package 剑指offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author Administrator
 *
 */
public class 从上往下打印二叉树 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null) {
			return null;
		}
		Queue<TreeNode> queue = new ArrayDeque<>();
		ArrayList<Integer> list = new ArrayList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode tn = queue.poll();
			list.add(tn.val);
			if (tn.left != null) {
				queue.add(tn.left);
			}
			if (tn.right != null) {
				queue.add(tn.right);
			}
		}	
		return list;
	}
}
