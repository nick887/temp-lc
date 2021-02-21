package leetcode.offer16;

class Solution {
    public double myPow(double x, int n) {
        double temp=1;
        if(0.99999999999999<x&&x<1.000000000000001)
            return 1;
        if(n>=0)
        {
            for (int i = 0; i < n; i++) {
                temp*=x;
            }
        }
        else {
            if(n==Integer.MAX_VALUE)
                return 0;
            for (int i = 0; i < (-n); i++) {
                temp /= x;
            }
        }
        return temp;
    }
}