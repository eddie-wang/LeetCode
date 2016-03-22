//idea : for every bar find the first left bar smaller than it  and the first right bar that is smaller that it. then for that bar the largest area is (right -left)*heights[bar].  
public class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<Integer>();
        int max=0;
        for(int i=0;i<=heights.length;i++){
            int h=heights.length==i?0:heights[i];
            if(stack.empty()||h>=heights[stack.peek()]){
                stack.push(i);
            }else{
                int cur=stack.pop();
                max=Math.max(max,heights[cur]*(stack.empty()?i:i-1-stack.peek()));
                i--;
            }
        }
        return max;
    }
}