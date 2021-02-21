package leetcode.offer14_2;

class Solution {
    public int cuttingRope(int n) {
        if(n<=3)
            return n-1;
        if(n%3==0) {
            int temp=1;
            for (int i = 0; i < n/3; i++) {
                temp*=3;
                temp%=1000000007;
            }
            return temp;
        }
        else if(n%3==2)
        {
            int temp=1;
            for (int i = 0; i < (n-2)/3; i++) {
                temp*=3;
                temp%=1000000007;
            }
            return temp*2;
        }
        else if(n%3==1)
        {
            int temp=1;
            for (int i = 0; i < (n-1)/3-1; i++) {
                temp*=3;
                temp%=1000000007;
            }
            return temp*4;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}