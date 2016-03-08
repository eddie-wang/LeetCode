public class Solution {
    public int maxCoins(int[] nums) {
        if(nums.length==0) return 0;
        int [][]dp=new int[nums.length][nums.length];
        for(int len=0;len<nums.length;len++)
        for(int i=0;i+len<nums.length;i++){
            int j=len+i;
            int left=i-1>=0?nums[i-1]:1;
            int right=j+1<nums.length?nums[j+1]:1;
            
            for(int mid=i;mid<=j;mid++){
                dp[i][j]=Math.max(dp[i][j],(mid-1>=i?dp[i][mid-1]:0)+(mid+1<=j?dp[mid+1][j]:0)+nums[mid]*left*right);
            }
            // System.out.println(i+" "+j+" "+dp[i][j]);
        }
        return dp[0][nums.length-1];
    }
}