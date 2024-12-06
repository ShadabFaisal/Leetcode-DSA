package LinkedList;

import java.util.LinkedList;

public class LeetCode19DeleteNthNodeFromTheLast {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode temp=head;
	        int c=0;
	        while(temp!=null){
	            temp=temp.next;
	            c++;
	        }
	        ListNode t=head;
	        if(c-n==0){
	            return head.next;
	        }
	        for(int i=1;i<c-n;i++){
	            t=t.next;
	        }
	        t.next=t.next.next;

	        return head;       
    }

}
