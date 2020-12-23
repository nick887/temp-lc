package leetcode.lc48;

class Solution {
    public void rotate(int[][] matrix) {
            int m= matrix.length;
            int n=Math.abs(m- matrix.length);
            while (m>matrix.length/2)
            {
                n=Math.abs(m- matrix.length);
                for (int i = n; i <=m; i++) {
                        int temp=matrix[n][i];
                        matrix[n][i]=matrix[matrix.length-i][n];
                        matrix[matrix.length-i][n]=matrix[matrix.length-n][matrix.length-i];
                        matrix[matrix.length-n][matrix.length-i]=matrix[i][m];
                        matrix[i][m]=temp;
                }
                m--;
            }

    }
}

