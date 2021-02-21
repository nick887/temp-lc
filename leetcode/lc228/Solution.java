package leetcode.lc228;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        LinkedList<String> strings=new LinkedList<>();
        StringBuffer temp=new StringBuffer(nums[0]);
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]+1)
            {
                if(count>1) {
                    temp.append("->");
                    temp.append(nums[i - 1]);
                }
                strings.add(temp.toString());
                temp=new StringBuffer(nums[i]);
                count=0;
            }
            count++;
        }
        if(count>1) {
            temp.append("->");
            temp.append(nums.length-1);
        }
        strings.add(temp.toString());
        return strings;
    }
}