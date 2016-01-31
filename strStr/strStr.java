public class Solution {
    public int strStr(String haystack, String needle) {
       
        for(int cur=0;cur<haystack.length()-needle.length()+1;cur++)
        {   int index=0;
            while(index<needle.length()&&needle.charAt(index)==haystack.charAt(cur+index)) index++;
            if(index==needle.length())
            return cur;
        }
        return -1;
    }