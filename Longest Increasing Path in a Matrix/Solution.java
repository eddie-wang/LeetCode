public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        if(m==0) return 0;
        int n=matrix[0].length;
        int [][]depth=new int[m][n];
        int res=0;
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
            res=Math.max(dfs(matrix,depth,i,j,m,n),res);
        }
        return res;
    }
    
    private int dfs(int [][]matrix,int [][]depth,int i , int j, int m, int n){
        if(depth[i][j]!=0) return depth[i][j];
        int dep=0;
        int [][]direction={{0,1},{1,0},{0,-1},{-1,0}};
        
        for (int d=0;d<4;d++){
            if(i+direction[d][0]<m&&i+direction[d][0]>=0&&j+direction[d][1]<n&&j+direction[d][1]>=0&&matrix[i+direction[d][0]][j+direction[d][1]]>matrix[i][j]){
                dep=Math.max(dep,dfs(matrix,depth,i+direction[d][0],j+direction[d][1],m,n));
            }
        }
        depth[i][j]=dep+1;
        return dep+1;
    }
}