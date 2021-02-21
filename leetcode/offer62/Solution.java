package leetcode.offer62;

class Solution {
    public int lastRemaining(int n, int m) {
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=i;
        }
        int count=n;
        int index=0;
        while(count>1)
        {
            a[(index+m-1)%n]=-1;
            count--;
        }
        for (int i = 0; i < n; i++) {
            if(a[i]>-1)
                return a[i];
        }
        return 0;

    }
}