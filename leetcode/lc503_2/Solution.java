package leetcode.lc503_2;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        for (int i = 0; i < nums.length*2-1; i++) {
            if(stack.isEmpty())
                stack.push(i%nums.length);
            else
            {
                while (nums[stack.peek()]<nums[i%nums.length])
                {
                    res[stack.pop()]=nums[i%nums.length];
                }
                stack.push(i);
            }
        }
        return res;
    }
}