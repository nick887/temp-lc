package MyAlgorithrms;

import java.util.Random;

public class MergeSort {
    private static void merge(int[] a,int[] aux,int lo,int mid,int hi)
    {
        for (int i = 0; i < a.length; i++) {
            aux[i]=a[i];
        }
        int x=lo,y=mid+1;
        for (int i = lo; i <=hi ; i++) {
            if(x>mid) a[i]=aux[y++];
            else if(y>hi) a[i]=aux[x++];
            else if(aux[x]<aux[y]) a[i]=aux[x++];
            else a[i]=aux[y++];
        }
    }
    public static void sort(int[] a,int[] aux,int lo,int hi)
    {
        if(lo>=hi)
            return;
        int mid=(hi-lo)/2+lo;
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }
    public static void sort(int[] a)
    {
        int[] aux=new int[a.length];
        sort(a,aux,0,a.length-1);
    }

    public static void main(String[] args) {
        final int length=1000000;
        Random random=new Random();
        int[] a=new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(1000000);
        }
        long start =System.currentTimeMillis();
        MergeSort.sort(a);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
