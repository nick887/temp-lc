package leetcode.lc1018;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.math.*;

import static java.lang.Math.pow;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list=new LinkedList<>();
        BigInteger weight;
        weight=BigInteger.valueOf(0);
        BigInteger mod=BigInteger.valueOf(5);
        for (int j = 0; j < A.length; j++) {
            for (int i = 0; i < j; i++) {
                weight.add(BigInteger.valueOf((int)pow((double) 2,(double) i)*A[j-i]));
            }
            if(weight.mod(mod).compareTo(BigInteger.valueOf(0))>0?false:true)
                list.add(true);
            else
                list.add(false);
            weight=BigInteger.valueOf(0);
        }

        return list;

    }
}