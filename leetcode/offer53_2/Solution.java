package leetcode.offer53_2;

class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1])
                return i;
        }
        return -1;
    }
}