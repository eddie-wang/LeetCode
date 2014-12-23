public class Solution{
	public int reverse(int x){
		boolean sig=false;
		int r=0;
		if(x<0){
			sig=true;
			x=-x;
        }
        

        	while(x>0)
        	{
        		int t=x%10;
        		int temp=r;
        		r=r*10+t;
        		if((r-t)/10!=temp) return 0; //check if oveflow
        		x=x/10;
        		//System.out.println(r);
       		 }

       		return sig==true?-r:r;
        
        

	}
	public static void main(String[] args) {
		Solution s=new Solution();
		int n=s.reverse(Integer.parseInt(args[0]));
	    System.out.println(n);
	}
}