package leetcode.offer14_1;
class Solution {
    public int cuttingRope(int n) {
        if(n%3==0)
            return (int)Math.pow((double) 3,(double) n/3);
        else if(n%3==2)
            return (int)Math.pow((double) 3,(double) n-2/3)*2;
        else if(n%3==1)
            return (int)Math.pow((double) 3,(double) n-1/3-1)*4;
        return -1;
    }
}