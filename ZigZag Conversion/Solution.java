public class Solution {
   public String convert(String s,int nRows){
     if(nRows==1)
     return s;
          String result=new String ();
          for (int i=0;i<nRows;i++){
            int j=i;
            int temp=0;
            while(j<s.length())
            {
                result+=s.charAt(j);
                if(temp%2==0&&i!=nRows-1||i==0)
                  j+=2*(nRows-i-1);
                else
                  j+=2*i;
                temp++;

            }
          }

        return result;

  }
}