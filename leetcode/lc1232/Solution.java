package leetcode.lc1232;

import java.math.BigDecimal;
import java.text.DecimalFormat;

class Solution {
    DecimalFormat df=new DecimalFormat("0.00");
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==1)
            return true;
        if((coordinates[0][0]-coordinates[1][0])==0)
        {
            for (int i = 1; i < coordinates.length; i++) {
                if(coordinates[i][0]!=coordinates[i-1][0])
                    return false;
            }
        }
        else if ((coordinates[0][1]-coordinates[1][1])==0)
            for (int i = 1; i < coordinates.length; i++) {
                if (coordinates[i][1]!=coordinates[i-1][1])
                    return false;
            }
        else {
            String a;
            float k=(float)(coordinates[0][1]-coordinates[1][1])/(float)(coordinates[0][0]-coordinates[1][0]);
            a=df.format(k);
            for (int i = 2; i < coordinates.length; i++) {
                if((coordinates[i][0] - coordinates[i - 1][0])==0)
                    return false;
                if (!df.format((float)(coordinates[i][1] - coordinates[i - 1][1]) / (float)(coordinates[i][0] - coordinates[i - 1][0])).equals(a))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        double a=(float) 3/(float) 5;
        System.out.println(a);
    }
}