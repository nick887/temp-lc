package leetcode.offer61;

class Solution {
    public boolean isStraight(int[] nums) {
        for (int i = 0; i < 4; i++) {
            if(nums[i]!=nums[i+1]-1)
                return false;
        }
        return true;
    }
}