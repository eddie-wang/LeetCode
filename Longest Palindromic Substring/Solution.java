
public class Solution{
	public String longestPalindrome(String s){
		   int n=s.length();
		   boolean table[][]=new boolean [n][n];
		   int begin=0;
		   int maxlength=1;
		   for(int i=0;i<n;i++)
        	table[i][i]=true;
           for(int i=0;i<n-1;i++)
           if(s.charAt(i)==s.charAt(i+1))
            {
            	table[i][i+1]=true;
            	begin=i;
            	maxlength=2;
            	}   
               
			for(int len=3;len<=n;len++){
				for(int i=0;i<n-len+1;i++){
					if(table[i+1][i+len-2]==true&&s.charAt(i)==s.charAt(i+len-1))
					{
						table[i][i+len-1]=true;
						begin=i;
						maxlength=len;
					}
				}
			} 
			return s.substring(begin,begin+maxlength);
	}
	public static void main(String[] args) {
	
       String s=args[0];
       Solution solution=new Solution();
       System.out.println(solution.longestPalindrome(s));

	}
}	