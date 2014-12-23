
public class Solution
{
	
	public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0)  return "";
        int i=0;
        StringBuffer prefix=new StringBuffer();
        while(i<strs[0].length()){
            char temp=strs[0].charAt(i);
        	for(int j=1;j<n;j++){
        		if(i>=strs[j].length()||temp!=strs[j].charAt(i))
        			return prefix.toString();
        	}
             prefix.append(temp);
             i++; 
        }
        return prefix.toString();
    }
	public static void main(String[] args) {
		
		System.out.println((new Solution()).longestCommonPrefix(args));
	}
}