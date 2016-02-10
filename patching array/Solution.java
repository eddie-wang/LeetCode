/*
    Basic idea : greedy

    Suppose we already can build number from 1 to j. Then next element we want to add must smaller or euqals then j+1.
    If we add j+2 , then we wil miss j+1. 
    That comes to our solution, if next element in array is less than cur_reach_max+1, then we do not need to add new elememnt as the same tiem we update the cur_max_reach
    to cur_max_reach+nums[cur].
    else we need to add an element, here we choose a greedy strategy which implies than we should extend out reach as futher as poosible , from the above analysis we know that must be j+1
*/
public class Solution {
    public int minPatches(int[] nums, int n) {
        int cur=0;
        int result=0;
        int i=0;
        while(cur<n){
            if(i>=nums.length||cur+1<nums[i])
            {
               result++;
               cur=cur*2+1;
               if(cur<0) break;
            }else{
                cur+=nums[i];
                i++;
            }
        }
   
        return result;
    }
}