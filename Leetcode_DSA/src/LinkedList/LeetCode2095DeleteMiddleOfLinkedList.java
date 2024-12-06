package LinkedList;

public class LeetCode2095DeleteMiddleOfLinkedList {

	public static void main(String[] args) {

	}
	 public static ListNode deleteMiddle(ListNode head) {
	        if(head==null || head.next==null){
	            return null;
	        }
	        ListNode middle=findMiddleNode(head);
	        if(middle.next!=null){
	            middle.val=middle.next.val;
	            middle.next=middle.next.next;
	        }
	        else{
	            head.next=null;
	        }
	        return head;
	        
	    }
	 public ListNode deleteMid(ListNode head) {
	        if(head==null || head.next==null){
	            return null;
	        }
	       ListNode slow=head;
	        ListNode fast=head.next.next;
	        
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        slow.next=slow.next.next;
	        return head;
	        
	    }
	    public static ListNode findMiddleNode(ListNode head){
	        ListNode slow=head;
	        ListNode fast=head;
	        
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }

}
