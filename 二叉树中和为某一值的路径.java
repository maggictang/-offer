package ��ָoffer;

import java.util.ArrayList;

/**
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * @author Administrator
 *
 */
public class �������к�Ϊĳһֵ��·�� {
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	//��ǰ·��
	ArrayList<Integer> path = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if (root == null) {
			return list;
		}
		path.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			list.add(new ArrayList<>(path));
		}
		FindPath(root.left,target);
		FindPath(root.right,target);
		path.remove(path.size()-1);
		return list;
	}
}
