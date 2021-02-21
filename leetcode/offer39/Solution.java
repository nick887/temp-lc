package leetcode.offer39;

class Solution {
    public int majorityElement(int[] nums) {
        int counts=1;
        int temp=nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if(counts>0) {
                if (temp != nums[i])
                    counts--;
                else
                    counts++;
            }
            else {
                temp = nums[i];
                counts++;
            }
        }
        return temp;
    }
}