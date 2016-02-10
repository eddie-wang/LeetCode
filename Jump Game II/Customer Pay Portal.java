public class Solution {
    public int jump(int[] nums) {
        int jump_num=0,reach=0;
        int cur=0;
        while(reach<nums.length-1){
            int max=-1;
            while(cur<=reach){
                if(cur+nums[cur]>max)
                max=cur+nums[cur];
                cur++;
                
            }
            reach=max;
            jump_num++;
        }
        return jump_num;
    }
}