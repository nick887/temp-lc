package leetcode.lc503;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        boolean changed=false;
        for (int i = 0; i < nums.length; i++) {
            changed=false;
            for (int j = i+1; j < i+nums.length; j++) {
                if(nums[j%nums.length]>nums[i]) {
                    res[i] = nums[j % nums.length];
                    changed=true;
                }
            }
            if(changed==false)
                res[i]=-1;
        }
        return res;
    }
}