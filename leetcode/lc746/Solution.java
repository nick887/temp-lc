package leetcode.lc746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int i=0;
        int count=0;
        if(cost[i]<cost[i+1]) {
            if(cost[i+2]+cost[i]>cost[i+1])
                i++;
        }
        else
            i++;
        while(i<cost.length)
        {
            count+=cost[i];
            if(i==cost.length-1||i==cost.length-2)
                break;
            if(cost[i+2]>cost[i+1])
                i++;
            else
                i+=2;

        }
        return count;

    }
}