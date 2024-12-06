package LinkedList;

public class LeetCode21MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode node=new ListNode(list1.val);
                temp.next=node;
                temp=temp.next;
                list1=list1.next;
            }
            else{
                ListNode node=new ListNode(list2.val);
                temp.next=node;
                temp=temp.next;
                list2=list2.next; 
            }
        }

        while(list1!=null){
            ListNode node=new ListNode(list1.val);
                temp.next=node;
                temp=temp.next;
                list1=list1.next;
        }

        while(list2!=null){
             ListNode node=new ListNode(list2.val);
                temp.next=node;
                temp=temp.next;
                list2=list2.next; 
        }

        return dummy.next;
    }

}
