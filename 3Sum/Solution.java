/**
*思路： 先进行一次排序 （nlgn） ，然后 遍历a，每次都从剩下的有序数组中找到个和－a的两个数  一共时间复杂度是： n＊n；
**/
import java.util.*;
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
    	List<List<Integer>> result=new LinkedList<List<Integer>>();
    	//1.sort nlgn
    	Arrays.sort(num);
    	
    	int  n=num.length;
    	for(int i=0;i<n;i++){
    		//find two numbers whose sum is -num[i] from i+1 to n-1, add the index to List
    		if(i>0&&num[i]==num[i-1])
    			continue;
    		int sum=-num[i];
    		int j=i+1,k=n-1;
    		while(j<k){
    			if(num[j]+num[k]<sum)
    				j++;
    			else
    				if(num[j]+num[k]>sum)
    				k--;
    				else{
    					LinkedList<Integer> temp=new LinkedList<Integer>();
    					temp.add(num[i]);temp.add(num[j]);temp.add(num[k]);
    					result.add(temp);
    					do{
    						j++;
    					} while(j<n&&num[j]==num[j-1]);
    					do{
    						k--;
    					}while(k>=0&&num[k]==num[k+1]);
    				}    					
    		}
       	}
        return result;
    }
    public static void main(String[] args) {
    	int []num={0,0,0};
    	Solution s=new Solution();
    	System.out.println(s.threeSum(num));
    }
}