/*
FACT 1.There will a solution if the sum of gas[i]-cost[i]>0
FACT 2. If we start from i and violate the rules(sum from i to j become negative) until we come to j. Then it is impossible to start
from any station between i to j. Prove suppose we can start from k which is between i and j. We know that sum from i to k is positive, and sum from i to j is negative , then sum
from k to j must be negative.

*/

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0,end=0;
        int curcost=0,totalcost=0;
        while(end<cost.length){
           totalcost+=gas[end]-cost[end];
           curcost+=gas[end]-cost[end];
           if(curcost<0){
               start=end+1;
               curcost=0;
           }
           end++;
        }
        
        return totalcost<0?-1:start;
    }
}