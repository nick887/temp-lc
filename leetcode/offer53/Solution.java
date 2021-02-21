package leetcode.offer53;

import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
        int index=0;
        int count=1;
        int left=0,right=0;
        index= Arrays.binarySearch(nums,target);
        if(index==-1)
            return --count;
        else
        {
            left=index-1;
            right=index+1;
            while (left>-1&&right<nums.length&&nums[left--]==nums[index]||nums[right++]==nums[index])
            {
               count++;
            }
        }
        return count;
    }
}