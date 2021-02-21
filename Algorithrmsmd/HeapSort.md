# 堆排序
# 1. 堆的初始化
首先在数组中找到有子节点的下标最大节点，一般是N/2
```java
class HeadSort{
    public static void Sort(int[] n)
    {
        init(n);
        int N=n.length;
        int[] temp=new int[N];
        for (int i = 0; i < n.length; i++) {
            temp[i]=n[i];
        }
        while (N>1)
        {
            exch(n,1,N--);
            sink(n,N);
        }
    }
    public static init(int[] n)
    {
        for (int i = n.length/2; i >=1 ; i--) {
            sink(n,i,N);
            
        }
    }
    public void sink(int[] n,int N) {
        int k=1;
        while (2 * k < N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1))
                j++;
            if (!less(k, j))
                break;
            exch(k, j);
            k = j;
        }
    }
}
```