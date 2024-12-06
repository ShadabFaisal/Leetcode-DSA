package LinkedList;

public class LeetCode25ReverseNodesInkGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || k == 1)
			return head;

		ListNode dummy = new ListNode();
		dummy.next = head;

		ListNode cur = dummy, pre = dummy, nex = dummy;
		int count = 0;
		while (cur.next != null) {
			cur = cur.next;
			count++;
		}

		while (count >= k) {
			cur = pre.next;
			nex = cur.next;
			for (int i = 1; i < k; i++) {
				cur.next = nex.next;
				nex.next = pre.next;
				pre.next = nex;
				nex = cur.next;
			}
			pre = cur;
			count -= k;
		}
		return dummy.next;
	}

}
