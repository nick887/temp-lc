package leetcode.offer21;

class Solution {
    public int[] exchange(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right)
        {
            if(nums[left]%2==1&&nums[right]%2==0)
            {
                left++;
                right--;
            }
            else
                if(nums[left]%2==1&&nums[right]%2==1)
                {
                    left++;
                }
                else
                if(nums[left]%2==0&&nums[right]%2==0)
                {
                    right++;
                }
                else
                if(nums[left]%2==0&&nums[right]%2==1)
                {
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    left++;
                    right--;
                }

        }
        return nums;
    }
}