/**
* http://leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
*/
public class Solution3 {

	public String longestPalindrome(String s){
	    int n=s.length();
	    n=2*n;
	    int [] p =new int [n];
	    int c=1,r=2;
	    if(s=="") return s;
	    if(s.length()==1) return s;
	    p[0]=0; 
        if(s.charAt(0)==s.charAt(1))
	    p[1]=1;
	    for(int i=2;i<n-1;i++){
	    	int i_mirror=2*c-i;
	    	p[i]=Math.min(p[i_mirror],r-i);
	    	while(true)
	    	{
	    		int x=i-p[i]-1;
	    		int y=i+p[i]+1;
	            if(x<0||y>n-1)
	            break; 
	    		if(x%2==1)
	    			p[i]++;
	    		else
	    			if(s.charAt(x/2)==s.charAt(y/2))
	    				p[i]++;
	    			else
	    				break;
	    	}

	    	if(i+p[i]>r){

	    		c=i;
	    		r=i+p[i];
	    	}
	    }
    
	    int maxlen=0;
	    int centerIndex=0;
	    for(int i=1;i<n-1;i++){
	    	if(p[i]>maxlen){
	    		maxlen=p[i];
	    	    centerIndex=i;
	    	}
	    	System.out.println(p[i]);
	    }	
	    System.out.println(maxlen+" "+centerIndex);
	    return s.substring((centerIndex-maxlen+1)/2,(centerIndex+maxlen)/2+1);
	}
	 public static void main(String[] args) {
	
       String s=args[0];
       Solution3 solution=new Solution3();
       System.out.println(solution.longestPalindrome(s));

	}

}