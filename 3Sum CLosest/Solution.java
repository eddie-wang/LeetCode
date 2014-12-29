/**
*思路： 先进行一次排序 （nlgn） ，然后 遍历a，每次都从剩下的有序数组中找到个和－a的两个数  一共时间复杂度是： n＊n；
**/
import java.util.*;
public class Solution {
    public int threeSum(int[] num,int target) {
    	//1.sort nlgn
    	Arrays.sort(num);
    	for(int i:num){
    		System.out.println(i);
    	}
    	int  n=num.length;
    	int  closest=num[0]+num[1]+num[n-1]; 
    	for(int i=0;i<n-2;i++){
    		//find two numbers whose sum is -num[i] from i+1 to n-1, add the index to List
    		int sum=target-num[i];
    		int j=i+1,k=n-1;
    		while(j<k){
    	     closest=Math.abs(target-closest)<Math.abs(num[i]+num[j]+num[k]-target)?closest:num[i]+num[j]+num[k];    			
    			if(num[j]+num[k]<sum)
    				j++;
    			else
    				if(num[j]+num[k]>sum)
    			     	k--;
    				else
    					break;  					
    		}

    		
       	}
        return closest;
    }
    public static void main(String[] args) {
    	int []num={87,6,-100,-19,10,-8,-58,56,14,-1,-42,-45,-17,10,20,-4,13,-17,0,11,-44,65,74,-48,30,-91,13,-53,76,-69,-19,-69,16,78,-56,27,41,67,-79,-2,30,-13,-60,39,95,64,-12,45,-52,45,-44,73,97,100,-19,-16,-26,58,-61,53,70,1,-83,11,-35,-7,61,30,17,98,29,52,75,-73,-73,-23,-75,91,3,-57,91,50,42,74,-7,62,17,-91,55,94,-21,-36,73,19,-61,-82,73,1,-10,-40,11,54,-81,20,40,-29,96,89,57,10,-16,-34,-56,69,76,49,76,82,80,58,-47,12,17,77,-75,-24,11,-45,60,65,55,-89,49,-19,4}; 

    	Solution s=new Solution();
    	System.out.println(s.threeSum(num,-275));
    }
}