package ��ָoffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author Administrator
 *
 */
public class �������´�ӡ������ {
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
