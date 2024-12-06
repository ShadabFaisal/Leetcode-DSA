package LinkedList;

public class LeetCode82RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=new ListNode();
        dummy.next=head;

        ListNode temp=head;
        ListNode prev=dummy;
        while(temp!=null && temp.next!=null){
            boolean duplicatesFound=false;
            while(temp!=null && temp.next!=null && temp.val==temp.next.val){
                duplicatesFound=true;
                temp=temp.next;
            }
            if(!duplicatesFound){
                prev=prev.next;
            }
            else{
                prev.next=temp.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }

}
