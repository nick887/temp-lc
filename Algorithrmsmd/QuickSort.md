# 快速排序
## 1. 实现原理
选取数组的一段，一般去数组第一个元素为界限，下标i指向1，下标j指向length-1
j先走，当j指向元素不大于界限时，i后移，当i的条件也不满足时，双方交换
如此循环
## 2. 代码
```java
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
        int[] a=new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(100000);
        }
        long start =System.currentTimeMillis();
        sort(a);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
```