package MyAlgorithrms;

import java.util.Arrays;
import java.util.Random;

class QuickSort
{
    public static int partition(int[] n,int lo,int hi)
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
    public static int less(int[] n,int i,int j)
    {
        return n[j]-n[i];
    }
    public static void exch(int[] n,int i, int j)
    {
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
    }
    public static void sort(int[] n,int low,int high)
    {
        if(high<=low)
            return;
        int i=partition(n,low,high);
        sort(n,low,i-1);
        sort(n,i+1,high);
    }
    public static void sort(int[] n)
    {
        int lo=0;
        int hi=n.length-1;
        sort(n,lo,hi);
    }
    public static void main(String[] args) {
        Random random=new Random();
        int[] a=new int[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(1000000);
        }
        long start =System.currentTimeMillis();
        sort(a);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(1000000);
        }
        long start1 =System.currentTimeMillis();
        Arrays.sort(a);
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);
    }
}