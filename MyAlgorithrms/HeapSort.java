package MyAlgorithrms;

public class HeapSort {
        public static void Sort(int[] n)
        {
            int N=n.length+1;
            int[] temp=new int[N];
            for (int i = 1; i < N; i++) {
                temp[i]=n[i-1];
            }
            init(temp);
            N--;
            while (N>1)
            {
                n[N-1]=temp[1];
                exch(temp,1,N--);
                sink(temp,1,N);
            }
        }
        public static void init(int[] n)
        {
            int N=n.length;
            for (int i = n.length/2; i >=1 ; i--) {
                sink(n,i,N);
            }
        }
        public static void sink(int[] n,int i,int N) {
            int k=i;
            while (2 * k < N) {
                int j = 2 * k;
                if (j < N && less(n,j, j + 1)<0)
                    j++;
                if (less(n,k, j)>0)
                    break;
                exch(n,k, j);
                k = j;
            }
        }
        public static void exch(int[] n,int i,int j)
        {
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
        }
        public static int less(int[] n,int i,int j)
        {
            return n[i]-n[j];
        }

    public static void main(String[] args) {
            int[] a=new int[15];
            for (int i =0; i < a.length; i++) {
                a[i]=15-i;
                System.out.println(a[i]);
            }
            Sort(a);
            System.out.println("------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
