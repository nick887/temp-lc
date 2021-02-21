package leetcode.lc119;


import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if (j==0||j==i)
                    list.add(1);
                else
                {
                    list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }
            }
            lists.add(list);
        }
        return lists.get(rowIndex);
    }
}