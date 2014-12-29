/**
* Definition for single-linked list
 *public class ListNode{
 *         int val;
 *		   ListNode next;
 * 		   ListNode(int x){
 *
 *				val=x;
 *				next=null;
 *		   }	
 *} 
*/
public class Solution{
	public ListNode swapPairs(ListNode head){
		if(head==null) return head;
		ListNode cur=head;
		ListNode next=cur.next;
		ListNode prev=null;
		if(next!=null) head=next;
		while(next!=null){
			if(prev!=null){
			  prev.next=next;
			  prev=cur;
		    }
			else{
				prev=cur;
			}
			cur.next=next.next;
			next.next=cur;
			cur=cur.next;
			if(cur==null)
				break;
			else
			   next=cur.next;	
		}
		return head;
	}
}