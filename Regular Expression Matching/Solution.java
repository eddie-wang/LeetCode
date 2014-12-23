public class Solution{
	 public boolean isMatch(String s, String p) {

	 		if(p.equals("")&&s.equals(""))
	 			return true;
	 	     else
	 	     	if(p.equals(""))
	 	     		return false;
	    
	    if(p.length()>1&&p.charAt(1)!='*'||p.length()==1)
	    {
	    	return s.length()>0&&(p.charAt(0)==s.charAt(0)||p.charAt(0)=='.')&&isMatch(s.substring(1),p.substring(1));
	    }

        int m=0;
	    if(p.length()>1&&p.charAt(1)=='*'){
	    	while(m<s.length()&&(s.charAt(m)==p.charAt(0)||p.charAt(0)=='.'))
	    		if(isMatch(s.substring(m++),p.substring(2)))
	    			return true;		
            return isMatch(s.substring(m),p.substring(2));
         }
         return false;
	     
    }
        
	public static void main(String[] args) {
		Solution s=new Solution();
		boolean n=s.isMatch(args[0],args[1]);
	    System.out.println(n);
	}
}