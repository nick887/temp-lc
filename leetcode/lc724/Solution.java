package leetcode.lc724;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        int left=0,right=sum-nums[0],index=1;
        while (index<nums.length)
        {
            if(right==left)
                return index;
            right-=nums[index];
            left+=nums[index-1];
            index++;
        }
        return -1;
    }
}