package leetcode.offer42;

import javax.crypto.AEADBadTagException;
import java.util.ArrayList;

class Solution {
    public int maxSubArray(int[] nums) {
        int j=0;
        int count=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (j<nums.length){
            count+=nums[j];
            if(count<0)
            {
                arrayList.add(count);
                count=0;
                j++;
            }
            else {
                arrayList.add(count);
                j++;
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            if(arrayList.get(i)>max)
                max=arrayList.get(i);
        }
        return max;
    }
}