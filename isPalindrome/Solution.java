public class Solution{
	 public boolean isPalindrome(int x) {
	 	 if(x<0)
	 	 	return false;
	 	 int l=1;
	 	 double temp=0.1;
	 	 int y=x;
	 	 int r=10;
	 	 while(y>0){y=y/10; temp=temp*10;};
	 	 l=(int)(temp);
	 	 System.out.println(l+" "+r);
	 	 while(l>=r){
	 	 	if(x/l%10!=x%r/(r/10))
	 	 		return false;
	 	 	l/=10;
	 	 	r*=10;
	 	 } 

         return true;
	 	
    }
        
	public static void main(String[] args) {
		Solution s=new Solution();
		boolean n=s.isPalindrome(Integer.parseInt(args[0]));
	    System.out.println(n);
	}
}