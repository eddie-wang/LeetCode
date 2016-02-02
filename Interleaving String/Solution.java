public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1=s1.length(),len2=s2.length(); 
        if(len1+len2!=s3.length()) return false;
       
        boolean res[][]=new boolean[len1+1][len2+1];
         if(s3.length()==0) res[0][0]=true;
        for(int i=1;i<len1+1;i++){
            if(s1.substring(0,i).equals(s3.substring(0,i)))
            res[i][0]=true;
        }
        
         for(int i=1;i<len2+1;i++){
            if(s2.substring(0,i).equals(s3.substring(0,i)))
            res[0][i]=true;
        }
       // System.out.println(res[0][1]+" "+res[1][0]);
        for(int i1=1;i1<len1+1;i1++)
        for(int i2=1;i2<len2+1;i2++){
            if((s1.charAt(i1-1)==s3.charAt(i1+i2-1)&&res[i1-1][i2]==true)||(s2.charAt(i2-1)==s3.charAt(i1+i2-1)&&res[i1][i2-1]==true))
            res[i1][i2]=true;
        }
        //if(len1==0&&len2==0&&s3.length()==0) return true;
        return res[len1][len2];
    }
}