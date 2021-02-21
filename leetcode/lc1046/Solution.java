package leetcode.lc1046;
import java.util.*;
class Solution {
    static Comparator<Integer> cmp = new Comparator<Integer>() {
        public int compare(Integer e1, Integer e2) {
            return e2 - e1;
        }
    };
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(stones.length,cmp);
        for (int i = 0; i < stones.length; i++) {
            q.add(stones[i]);
        }
        while(!q.isEmpty())
        {
            if(q.size()>1) {
                int a1 = q.poll();
                int a2 = q.poll();
                if (a1 != a2)
                    q.add(Math.abs(a1 - a2));
            }
            else
            {
                return q.poll();
            }
        }
        return 0;
    }
}