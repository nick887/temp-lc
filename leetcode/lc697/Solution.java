package leetcode.lc697;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

class Solution {
    public int findShortestSubArray(int[] nums) {
        int max=-1;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else
                hashMap.put(nums[i],1);
        }
        for (Integer i :
                hashMap.keySet()) {
            if(hashMap.get(i)>max)
                max=hashMap.get(i);
        }
        for (Integer i :
                hashMap.keySet()) {
            if (hashMap.get(i) == max)
            {
                stack.push(i);
            }
        }
        while (!stack.isEmpty())
        {
            int i=stack.pop();
            int lf=0,rt=nums.length-1;
            while (!(nums[lf]==i&&nums[rt]==i))
            {
                if(lf>=rt)
                    break;
                if(nums[lf]!=i)
                    lf++;
                if(nums[rt]!=i)
                    rt--;
            }
            if(min>lf-rt)
                min=lf-rt;
        }
        return min;
    }
}