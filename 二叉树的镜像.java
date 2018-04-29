package 剑指offer;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author Administrator
 *
 */
public class 二叉树的镜像 {

	public void Mirror1(TreeNode root) {
		if(root == null) {
			return;
		}
		//层次遍历树
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
			//交换
			TreeNode temp = null;
			temp = tn.left;
			tn.left = tn.right;
			tn.right = temp;
		}
	}
}
