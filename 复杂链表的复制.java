package ��ָoffer;



import util.RandomListNode;

/**
 * ����һ����������
 * (ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ�)
 * ���ؽ��Ϊ���ƺ��������head��
 * (ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿ�)
 * @author Administrator
 *
 */
public class ��������ĸ��� {
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		RandomListNode pCur = pHead;
		//����next ��ԭ����A->B->C ���A->A'->B->B'->C->C'
		while(pCur != null) {
			RandomListNode node = new RandomListNode(pCur.label);
			node.next = pCur.next;
			pCur.next = node;
			pCur = node.next;
		}
		//����random pCur��ԭ������Ľ�� pCur.next�Ǹ���pCur�Ľ��
		pCur = pHead;
		while(pCur != null) {
			if (pCur.random != null) {
				pCur.next.random = pCur.random.next;
			}
			pCur = pCur.next.next;
		}
		RandomListNode head = pHead.next;
		RandomListNode cur = head;
		pCur = pHead;
		while(pCur != null) {
			pCur.next = pCur.next.next;
			if (cur.next != null) {
				cur.next = cur.next.next;
			}
			pCur = pCur.next;
			cur = cur.next;
		}
		return head;
	}
}
