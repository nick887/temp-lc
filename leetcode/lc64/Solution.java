package leetcode.lc64;

class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int left=200;
                int up=200;
                if(j-1>=0)
                    left=grid[i][j-1];
                if(i-1>=0)
                    up=grid[i-1][j];
                System.out.print(left+up+"  ");
                grid[i][j]+=Math.min(left,up);
            }
            System.out.println();
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}