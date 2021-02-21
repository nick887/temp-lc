package leetcode.lc703;

import java.util.*;

class KthLargest {
    int k;
    ArrayList<Integer> arrayList;
    public KthLargest(int k, int[] nums) {
        arrayList=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }
        this.k=k;
    }

    public int add(int val) {
        arrayList.add(val);
        return select(arrayList,k);
    }
    public static int select(ArrayList<Integer> a,int k)
    {
        int lo=0,hi=a.size()-1;
        while (hi>lo)
        {
            int j= partition(a,lo,hi);
            if(j>k)
                hi=j-1;
            else if(j<k)
                lo=j+1;
            else
            {
                return a.get(j);
            }
        }
        return a.get(k);
    }
    public static int partition(ArrayList<Integer> n,int lo,int hi)
    {
        int i=lo;
        int j=hi+1;
        while (true) {
            while (less(n, lo, ++i) < 0) {
                if (i == hi)
                    break;
            }
            while (less(n, lo, --j) > 0) {
                if (j == lo)
                    break;
            }
            if (i >= j)
                break;
            exch(n,i,j);
        }
        exch(n,lo,j);
        return j;
    }
    public static int less(ArrayList<Integer> n,int i,int j)
    {
        return n.get(j)-n.get(i);
    }
    public static void exch(ArrayList<Integer> n,int i, int j)
    {
        int temp=n.get(i);
        n.set(i,n.get(j));
        n.set(j,temp);
    }
}