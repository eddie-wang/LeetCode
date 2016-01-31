public class Solution {
    public int removeDuplicates(int[] A) {
          int next=0,cur=0;
          int num=0;
          while(cur<A.length){
              A[next]=A[cur];
              next++;
              cur++;
              num++;
              while(cur<A.length&&A[cur]==A[cur-1]) 
                cur++;
          }
          return num;
    }
}