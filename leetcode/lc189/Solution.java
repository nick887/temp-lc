package leetcode.lc189;

class Solution {
    public void rotate(int[] nums, int k){
        for(int j=0;j<k;j++) {
            int temp=nums[nums.length-1];
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1];
            }
            nums[0]=temp;
        }
    }
}
