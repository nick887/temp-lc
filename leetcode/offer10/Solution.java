package leetcode.offer10;

class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int i=0;
        int j=1;
        int z=i;
        int count=0;
        for (int k = 0; k < n-2; k++) {
            i=j;
            j=z;
            z+=(i+j);
        }
        return z;
    }
}