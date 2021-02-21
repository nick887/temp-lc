package leetcode.offer57_2;

import java.util.ArrayList;

class Solution {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> a=new ArrayList<>();
        int index=0;
        for (int i = 1; i < target / 2; i++) {
            for (int j = i+1; j < target/2; j++) {
               if(sum(i,j)>target/2)
                   break;
               else if(sum(i,j)==target)
               {
                   int[] b=new int[j-i+1];
                   for (int k = 0; k < j-i+1; k++) {
                       b[k]=k+i;
                   }
                   a.add(b);
                   index++;
               }
            }
        }
        return a.toArray(new int[a.size()][]);
    }
    int sum(int from,int end)
    {
        return (end+from)/2*(end-from+1);
    }
}