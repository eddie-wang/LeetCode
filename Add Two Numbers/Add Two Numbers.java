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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution=new ListNode(0);
        ListNode curnode=null;
        int carry=0;
        while(l1!=null||l2!=null)
        {
        	int val1=l1==null?0:l1.val;
        	int val2=l2==null?0:l2.val;                   
        	int temp=val1+val2+carry;
        	carry=temp/10;
        	temp=temp%10;
        	ListNode nextnode=new ListNode(0);          
            if(curnode!=null)
            {
               nextnode.val=temp;	
               curnode.next=nextnode;              
            }
            else
            {
               solution.val=temp;
               nextnode=solution; 
            }
             curnode=nextnode;
             
             if(l1!=null) l1=l1.next;
             if(l2!=null) l2=l2.next;
       }
          if(carry!=0)
          {
          	ListNode nextnode=new ListNode(carry); 
          	curnode.next=nextnode;
          }	 
          return solution;
    }
}