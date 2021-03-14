package leetcode.offer56_1;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] singleNumbers(int[] nums) {
        int temp=nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp^=nums[i];
        }
        int div=1;
        while ((div&temp)==0)
        {
            div<<=1;
        }
        int[] a=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if((div&nums[i])==0)
                a[0]^=nums[i];
            else
                a[1]^=nums[i];
        }
        return a;
    }
}