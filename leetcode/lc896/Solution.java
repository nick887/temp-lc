package leetcode.lc896;

class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length==1)
            return true;
        int mono=A[1]-A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i]==A[i-1])
                continue;
            else if(mono>0&&A[i]-A[i-1]<0)
                return false;
            else if(mono<0&&A[i]-A[i-1]>0)
                return false;
            mono=A[i]-A[i-1];
        }
        return true;
    }
}