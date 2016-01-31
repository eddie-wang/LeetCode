public class Solution {
    public int removeElement(int[] A, int elem) {
        int next=0,cur=0,num=0;
        while(cur<A.length){
            if(A[cur]==elem){
                cur++;
            }
            else{
                A[next]=A[cur];
                next++;
                cur++;
                num++;
            }
        }
        return num;
    }
}