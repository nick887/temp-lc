package leetcode.offer13;

class Solution {
    public int movingCount(int m, int n, int k) {
        Val val=new Val();
        val.val=0;
        boolean[][] isVisited=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                isVisited[i][j]=false;
            }
        }
        dfs(0,0,m,n,k,val,isVisited);
        return val.val;
    }
    public int dfs(int x,int y,int m,int n,int k,Val val,boolean[][] isVisited)
    {

        if(x==n-1&&y==m-1)
            return 1;
        if(x>=n||y>=m)
            return 0;
        if(isVisited[x][y]=true)
            return 0;
        int x10,x1,y10,y1;
        x10=x/10;
        x1=x%10;
        y1=y%10;
        y10=y/10;
        int sum=x1+x10+y1+y10;
        if(sum>k)
            return 0;
        val.val++;
        isVisited[x][y]=true;
        return dfs(x+1,y,m,n,k,val,isVisited)+dfs(x,y+1,m,n,k,val,isVisited);
    }
}
class Val
{
    int val;
}