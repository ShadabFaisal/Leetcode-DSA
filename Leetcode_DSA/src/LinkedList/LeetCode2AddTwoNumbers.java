package LinkedList;

import java.util.LinkedList;

public class LeetCode2AddTwoNumbers {

	public static void main(String[] args) {
		LinkedList<ListNode> list1=new LinkedList<>();
		list1.add(new ListNode(2));
		list1.add(new ListNode(2));
		list1.add(new ListNode(2));
		LinkedList<ListNode> list2=new LinkedList<>();
		list2.add(new ListNode(5));
		list2.add(new ListNode(2));
		list2.add(new ListNode(2));
		
		ListNode list=addTwoNumbers(list1.peek(),list2.peek());
		System.out.println(list.val);
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }

}
