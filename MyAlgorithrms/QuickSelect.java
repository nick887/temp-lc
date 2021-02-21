package MyAlgorithrms;

import java.util.Random;

public class QuickSelect {
    public static int select(int[] a,int k)
    {
        int lo=0,hi=a.length-1;
        while (hi>lo)
        {
            int j=QuickSort.partition(a,lo,hi);
            if(j>k)
                hi=j-1;
            else if(j<k)
                lo=j+1;
            else
            {
                return a[j];
            }
        }
        return a[k];
    }

    public static void main(String[] args) {
        int[] a=new int[10];
        Random random=new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=10-i;
            System.out.println(a[i]);
        }
        System.out.println("-------------");
        long start =System.currentTimeMillis();
        System.out.println(select(a,2));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
