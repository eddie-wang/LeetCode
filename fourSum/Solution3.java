import java.util.*;
public class Solution3 {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        Arrays.sort(num);
        int i,j;
        for(i=0;i<num.length-3;i++){

            if(i>0&&num[i]==num[i-1])
                continue;
            for(j=i+1;j<num.length-2;j++)
             {
                if(j!=i+1&&num[j]==num[j-1])
                    continue;
                int start=j+1,last=num.length-1;
                int sum=target-num[i]-num[j];
                while(start<last){
                    if(num[start]+num[last]<sum)
                        start++;
                    else if(num[start]+num[last]>sum)
                        last--;
                    else
                        {
                            List<Integer> temp=new LinkedList<Integer>();
                            temp.add(num[i]);
                            temp.add(num[j]);
                            temp.add(num[start]);
                            temp.add(num[last]);
                            result.add(temp);
                            start++;
                            last--;
                            while(start<last&&num[start]==num[start-1])
                                start++;
                            while(start<last&&num[last]==num[last+1])
                                last--;
                        }
                }
             }
         }
             return result;
    }
    public static void main(String[] args) {
        Solution3 s=new Solution3();
        int num[]={-2,-1,0,0,1,2};
        
        System.out.println(s.fourSum(num,0));
    }
}