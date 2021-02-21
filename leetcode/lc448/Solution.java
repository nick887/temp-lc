package leetcode.lc448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int[] count=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(count[i]==0)
                arrayList.add(count[i]);
        }
        return arrayList;
    }
}