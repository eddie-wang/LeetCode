public class Solution2{
	 public String longestPalindrome(String s){

	 	 int n=s.length();
	 	 if(n==0) return "";
	 	 String longest=s.substring(0,1);
	 	 for(int i=0;i<n-1;i++)
	 	 {
	 	 	String s1=expandAroundCenter(s,i,i);
	 	 	if(s1.length()>longest.length())
	 	 		longest=s1;
	 	 	String s2=expandAroundCenter(s,i,i+1);
	 	 	if(s2.length()>longest.length())
	 	 		longest=s2;
	 	 }
	 	 return longest;
	 }

	 private String expandAroundCenter(String s,int l,int r){
 		
 	     while(l>0&&r<s.length()&&s.charAt(l)==s.charAt(r))
 	     {
 	     	l--;
 	     	r++;
 	     }
 	     return s.substring(l+1,r);

	 }	
	 public static void main(String[] args) {
	
       String s=args[0];
       Solution2 solution=new Solution2();
       System.out.println(solution.longestPalindrome(s));

	}

}