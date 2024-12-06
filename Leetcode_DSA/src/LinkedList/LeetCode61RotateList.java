package LinkedList;

public class LeetCode61RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode rotateRight(ListNode head, int k) {

		int length = getLength(head);
		if (length <= 1 || k == 0 || k % length == 0) {
			return head;
		}
		if (k > length) {
			k %= length;
		}

		ListNode temp = head;
		ListNode prev = null;
		int breakPoint = length - k;
		while (breakPoint > 0 && temp != null) {
			prev = temp;
			temp = temp.next;
			breakPoint--;
		}
		prev.next = null;
		ListNode it = temp;
		if (it != null) {
			while (it.next != null) {
				it = it.next;
			}
			it.next = head;
		}
		return temp;
	}

	public static int getLength(ListNode head) {
		int count = 0;
		ListNode temp = head;

		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}
