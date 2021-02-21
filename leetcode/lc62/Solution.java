package leetcode.lc62;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ways=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ways[i][j]=0;
            }
        }
        ways[0][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int left=0;
                int up=0;
                if(j-1>=0)
                    left=ways[i][j-1];
                if(i-1>=0)
                    up=ways[i-1][j];
                ways[i][j]=left+up;
            }
        }
        return ways[m-1][n-1];
    }
}