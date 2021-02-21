package leetcode.lc1319;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int makeConnected(int n, int[][] connections) {
        int empty=0;
        int max=0;
        LinkedList<Integer>[] lists=new LinkedList[n];
        for (int i = 0; i < n; i++) {
            lists[i]=new LinkedList<>();
        }
        //init
        for (int i = 0; i < connections.length; i++) {
            lists[connections[i][0]].add(connections[i][1]);
            lists[connections[i][1]].add(connections[i][0]);
        }
        //main
        Count count=new Count();
        count.value=0;
        int[] CC=new int[n];

        for (int i = 0; i < lists.length; i++) {
            count.value=0;
            boolean[] isVisited=new boolean[n];
            for (int j = 0; j < isVisited.length; j++) {
                isVisited[j]=false;
            }
            dfs(lists,isVisited,CC,i,count,i,i);
            //        System.out.println(count.value);
            //        System.out.println("============================");
            if(count.value>max)
                max=count.value;

        }
        for (int i = 0; i < n; i++) {
            if(lists[i].isEmpty())
                empty++;
        }
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            System.out.println(CC[i]);
        }
        System.out.println(count.value);
        System.out.println(empty);
        return max>=empty?empty:-1;


    }
    public void dfs(LinkedList<Integer>[] lists,boolean[] isVisited,int[] CC,int index,Count count,int s,int last)
    {
        if(isVisited[index])
            return;
        System.out.println(index);
        isVisited[index]=true;
        CC[index]=count.value;
        for (Integer i:
                lists[index]) {
            if(i==s&&last!=s) {
                isVisited[index]=false;
                count.value++;
                return;
            }
        }
        for (Integer i:
                lists[index]) {
            dfs(lists,isVisited,CC,i,count,s,index);
        }
    }
    class Count
    {
        int value;
    }
}