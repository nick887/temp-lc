package leetcode.lc830;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists=new LinkedList<>();
        int start=0;
        int end=0;
        List<Integer> list=new LinkedList<>();
        int count=1;
        if(s.length()==1)
            return lists;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1))
                count++;
            else
            {
                if(count>=3) {
                    end = i - 1;
                    list.add(start);
                    list.add(end);
                    lists.add(list);
                    list=new LinkedList<>();
                    start=i;
                    count=1;
                }
                else
                {
                    start=i;
                    count=1;
                }
            }
        }
        if(count>=3)
        {
            end=s.length()-1;
            list.add(start);
            list.add(end);
            lists.add(list);
        }
        return lists;

    }
}