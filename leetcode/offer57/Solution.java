package leetcode.offer57;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int temp=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>target/2)
                break;
            temp=Arrays.binarySearch(nums,i+1,nums.length,target-nums[i]);
            if(temp>-1)
            {
                result[0]=nums[i];
                result[1]=nums[temp];
                break;
            }
        }
        return result;
    }
}