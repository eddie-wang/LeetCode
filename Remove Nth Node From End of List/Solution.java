/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode cur=head;
     int count=0;
     Listnode del=head;
     while(cur!=null)
     {
          if(count!=n+1){
             count++;
         }
         else{
             del=del.next;
         }
          cur=cur.next;
     }
     if(count!=n+1)
     	return head.next;
     del.next=del.next.next;
     return head;       
    }
}