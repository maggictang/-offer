package ��ָoffer;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ���������Ķ�����������任ΪԴ�������ľ���
 * @author Administrator
 *
 */
public class �������ľ��� {

	public void Mirror1(TreeNode root) {
		if(root == null) {
			return;
		}
		//��α�����
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode tn = queue.poll();
			if(tn.left != null) {
				queue.add(tn.left);
			}
			if (tn.right != null) {
				queue.add(tn.right);
			}
			//����
			TreeNode temp = null;
			temp = tn.left;
			tn.left = tn.right;
			tn.right = temp;
		}
	}
}
