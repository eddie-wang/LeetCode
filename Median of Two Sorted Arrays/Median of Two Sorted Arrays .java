public class Solution{
	public double findMedianSortedArrays(int A[] , int B []){
		int a_start=0,a_length=A.length;
		int b_start=0,b_length=B.length;
                if((a_length+b_length)%2==0)
                return  (getkth(A,a_start,a_length,B,b_start,b_length,(a_length+b_length)/2)+ getkth(A,a_start,a_length,B,b_start,b_length,(a_length+b_length)/2+1))/2;
		else
                return  getkth(A,a_start,a_length,B,b_start,b_length,(a_length+b_length)/2); 
	
              }

        private	double getkth(int A[],int a_start,int a_length,int B[],int b_start,int b_length,int k){
                System.out.println(a_start+" "+a_length+" "+b_start+" "+b_length+" "+k);
                if(a_length>b_length)
               		 return getkth(B,b_start,b_length,A,a_start,a_length,k);
                if(a_length==0)
               		 return B[b_start+k-1]; 
				if(k==1)
               		 return min(A[a_start],B[b_start]);
				int l=min(k/2,a_length),r=min(k/2,b_length);
                if(A[a_start+l-1]>B[b_start+r-1])
               		 return getkth(A,a_start,a_length,B,b_start+r,b_length-r,k-r);
 				else
					return getkth(A,a_start+l,a_length-l,B,b_start,b_length,k-l);                         
   	
	}

	private int min(int a, int b){
		return a<b?a:b; 
	}
		public static void main(String[] args) {
									
                 Solution s=new Solution();
                 int [] a={2};
                 int [] b={1,3,4};  
                 System.out.println(s.findMedianSortedArrays(a,b));
	}						
}
