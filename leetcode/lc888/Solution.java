package leetcode.lc888;

import java.util.HashMap;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int ASum=0,BSum=0;
        int diff=0;
        int[] res=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            ASum+=A[i];
        }
        for (int i = 0; i < B.length; i++) {
            BSum+=B[i];
            hashMap.put(B[i],B[i]);
        }
        if(ASum>=BSum)
        {
            diff=(ASum-BSum)/2;
            for (int i = 0; i < A.length; i++) {
                if(hashMap.containsKey(A[i]-diff))
                {
                    res[0]=A[i];
                    res[1]=A[i]-diff;
                    break;
                }
            }
        }
        else
        {
            diff=(BSum-ASum)/2;
            for (int i = 0; i < A.length; i++) {
                if(hashMap.containsKey(A[i]+diff))
                {
                    res[0]=A[i];
                    res[1]=A[i]-diff;
                    break;
                }
            }
        }
        return res;
    }
}