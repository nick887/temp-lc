
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int status=0;
        int[] result=new int[matrix.length*matrix[0].length];
        int i=0,j=0;
        int index=0;
        int width=matrix[0].length;
        int height= matrix.length;
        while(width>matrix[0].length/2&&height> matrix.length/2)
        {
            if(index>=result.length)
                break;
            switch (status){
                case 0:
                    if(j<width&&j>matrix[0].length-width-1)
                    {
                        System.out.println(matrix[i][j]);
                        result[index++]=matrix[i][j++];
                    }
                    else
                    {
                        j--;
                        i++;
                        status++;
                    }
                    break;
                case 1:
                    if(i<height&&i> matrix.length-height-1)
                        result[index++]=matrix[i++][j];
                    else
                    {
                        j--;
                        i--;
                        status++;
                    }
                    break;
                case 2:
                    if(j<width&&j>matrix[0].length-width-1&&i<height&&i> matrix.length-height-1)
                        result[index++]=matrix[i][j--];
                    else
                    {
                        j++;
                        i--;
                        status++;
                    }
                    break;
                case 3:
                    if(i<height&&i> matrix.length-height)
                        result[index++]=matrix[i--][j];
                    else
                    {
                        status++;
                    }
                    break;
                case 4:
                    i++;
                    j++;
                    width--;
                    height--;
                    status=0;
                    break;
            }
        }
        return result;
    }
}