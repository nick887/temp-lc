package leetcode.lc189_2;

class Solution {
    public void rotate(int[] nums, int k) {
        int index=nums.length-k;
        int temp1=nums[index];
        int temp2=nums[index];
        boolean chose=false;
        for (int i = 0; i < k; i++) {
            if(chose) {
                temp1 = nums[(index + k) % nums.length];
                nums[(index + k) % nums.length] = temp2;
                index = (index + k) % nums.length;
            }
            else
            {
                temp2 = nums[(index + k) % nums.length];
                nums[(index + k) % nums.length] = temp1;
                index = (index + k) % nums.length;
            }

        }

    }
}