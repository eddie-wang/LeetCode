
/**  
* Definition for singly-linked list.
*  class ListNode {
*     int val;
*      ListNode next;
*      public ListNode(int x) {
*          val = x;
*          next = null;
*      }
*  }
*/
import java.util.*; 

public class Solution {
    ListNode [] heap;
    int n=0;
    public ListNode mergeKLists(List<ListNode> lists) {
    	ListNode head=null;
    	ListNode cur=null;
    	int k=lists.size();
    	heap= new ListNode [k+1]; 
        for(ListNode t:lists){
        	if(t!=null)
        	insert(t);
        }
    	while(n!=0){
    		ListNode t=min();
    		if(head==null){
    			head=t;
    			cur=head;
    		}
    		else{
    			cur.next=t;
    			cur=cur.next;
    		}

    		if(t.next!=null)
    			insert(t.next);
    		
    	}
        return head;
    }

    void  insert(ListNode a){
    	heap[++n]=a;
    	swim(n);
    }
   ListNode  min(){
    	ListNode t=heap[1];
    	heap[1]=heap[n];
    	heap[n--]=null;
    	sink(1);
    	return t;
    }
    void sink(int i){
    	while(2*i<=n){
    		int j=2*i;
    		if(j<n&&heap[j].val>heap[j+1].val) j++;	
    		if(heap[i].val<heap[j].val) break;
    		exchange(i,j);
    		i=j;
    	}
    }
    void swim(int i){
    	while(i>1&&heap[i].val<heap[i/2].val){
    		exchange(i,i/2);
    		i/=2;
    	}
    }
    void exchange(int i,int j){
    	ListNode temp=heap[i];
    	heap[i]=heap[j];
    	heap[j]=temp;
    }
    
}