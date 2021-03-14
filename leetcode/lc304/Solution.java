package leetcode.lc304;

class NumMatrix {
    private int[][] matrix;
    public NumMatrix(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return;
        this.matrix=matrix;
        for (int i = 0; i < matrix.length; i++) {
            int temp=0;
            for (int j = 0; j < matrix[0].length; j++) {
                temp+=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int temp=0;
            for (int j = 0; j < matrix.length; j++) {
                temp+=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrix[row2][col2]-(col1-1<0?0:matrix[row2][col1-1])-(row1-1<0?0:matrix[row1-1][col2])+((row1-1<0||col1-1<0)?0:matrix[row1-1][col1-1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */