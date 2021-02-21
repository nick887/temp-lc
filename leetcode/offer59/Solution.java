package leetcode.offer59;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] maxSlidingWindow(int[]nums, int k) {
        int[] temp=new int[0];
        if(nums.length==0)
            return temp;
        int[] result=new int[nums.length-k+1];
        int index=0;
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for (int i = 0; i < k; i++) {
            if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
        }
        result[index++]=max;
        for (int i = k; i < nums.length; i++) {
            if(nums[i]>=max)
            {
                max=nums[i];
                maxIndex=i;
                result[index++]=max;
            }
            else if(inWindow(maxIndex,i-k+1,i))
            {
                result[index++]=max;
            }
            else
            {
                max=Integer.MIN_VALUE;
                for (int j = i-k+1; j < i+1; j++) {
                    if(nums[j]>max)
                    {
                        max=nums[j];
                        maxIndex=j;
                    }
                }
                result[index++]=max;
            }
        }
        return result;
    }
    boolean inWindow(int maxIndex,int from,int end)
    {
        if(maxIndex>=from&&maxIndex<=end)
            return true;
        else
            return false;
    }
}