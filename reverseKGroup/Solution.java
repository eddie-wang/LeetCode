class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
		next=null;
	}
}


public class Solution{

	public ListNode reverseKGroup(ListNode head, int k){
		ListNode cur=head,next,t,last=null;
		while(true){
			t=cur;
			for(int i=0;i<k;i++){
				if(t==null)
				return head;
				t=t.next;
             }
            next=cur.next;
			for(int i=0;i<k-1;i++)
			{
				t=next.next;
				next.next=cur;
                cur=next;
                next=t;
			}
			if(last!=null){
				t=last.next;
				last.next.next=next;
				last.next=cur;
				cur=next;
				last=t;
				last.next=cur;
			}
			else{
				last=head;
				head=cur;
				cur=next;
				last.next=cur;
			}

		}
	}
	public static void main(String[] args) {
		ListNode head=null,cur=null;
		for(int i=0;i<args.length;i++){
			ListNode n=new ListNode(Integer.parseInt(args[i]));
			if(head==null){
				head=n;
				cur=n;
			}
			else{
				cur.next=n;
				cur=n;
			}
		}
		
		Solution s=new Solution();
		cur=s.reverseKGroup(head,2);
		
		while(cur!=null){
			System.out.println(cur.val);
			cur=cur.next;
		}
	}
} 
