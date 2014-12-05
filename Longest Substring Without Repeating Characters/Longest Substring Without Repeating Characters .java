/**
*Acutally, my solution is not good enough，because HashMap is a little huge which waste some time.
*As char has 8 bit,so we can simulate hashtable with a array of size of 256 ,and will spare lots of time.
*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int i=0;
        int max=0;
        int temp=0;
        int startpos=0;
        for(i=0;i<s.length();i++)
        {    
        	
             Integer oldvalue=hm.put(s.charAt(i),i);
             if(oldvalue==null)
             {	
             	temp++;
             
             }
             else
             {   
             	if(oldvalue<startpos)
             	 { 	
             	 	temp++;
             	 	continue;
             	 }
             	if(temp>max)
             	{
             	 max=temp;
             	}
             	temp=i-oldvalue;
             	startpos=oldvalue+1;
              }
          
        }
        max=temp>max?temp:max;
        return max; 
    }
}