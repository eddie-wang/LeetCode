
public class Solution
{
	public int maxArea(int [] height)
	{
		int n=height.length;
		if(n==0) return 0;
		int i=0,j=n-1;
		int nmax=0;
        while(i<j){
        	nmax=Math.max(nmax,(j-i)*Math.min(height[i],height[j]));
        	if(height[i]>height[j]){
        		int temp=j;
        		while(i<j&&height[j]<=height[temp]) j--;
        	}else{
        		int temp=i;
        		while(i<j&&height[i]<=height[temp]) i++;
        	}
            
        }
        return nmax;
	}
	public static void main(String[] args) {
		int n=args.length;
		int [] height=new int [n];
		for(int i=0;i<n;i++){
			height[i]=Integer.parseInt(args[i]);
		}
		System.out.println((new Solution()).maxArea(height));
	}
}