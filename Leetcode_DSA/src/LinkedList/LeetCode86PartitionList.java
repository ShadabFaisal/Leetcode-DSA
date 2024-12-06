package LinkedList;

public class LeetCode86PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode();
        ListNode higher=new ListNode();
        ListNode smallHead=small,higherHead=higher;

        while(head!=null){
            if(head.val<x){
                smallHead.next=head;
                smallHead=smallHead.next;
            }
            else{
                higherHead.next=head;
                higherHead=higherHead.next;
            }
            head=head.next;
        }
        higherHead.next=null;
        smallHead.next=higher.next;

        return small.next;
    }

}
