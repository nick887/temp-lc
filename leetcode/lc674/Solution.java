package leetcode.lc674;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int countMax=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1])
                count++;
            else
            {
                if(count>countMax)
                    countMax=count;
                count=1;
            }
        }
        return countMax;
    }
}