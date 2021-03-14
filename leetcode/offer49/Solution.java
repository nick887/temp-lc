package leetcode.offer49;

class Solution {
    public int nthUglyNumber(int n) {
        int[] count=new int[n+1];
        count[0]=0;
        count[1]=1;
        int index2=1;
        int index3=1;
        int index5=1;
        for (int i = 2; i < count.length; i++) {
            while (!((count[index2]*2>count[i-1])&&(count[index2-1]*2<count[i-1]))) {
                System.out.println(count[index2]);
                System.out.println(count[i-1]);
                System.out.println(count[index2-1]);
                System.out.println(count[i-1]);
                index2++;
            }
            while (!(count[index3]*3>count[i-1]&&count[index3-1]*3<count[i-1]))
                index3++;
            while (!(count[index5]*5>count[i-1]&&count[index5-1]*5<count[i-1]))
                index5++;
            count[i]=Math.min(count[index2]*2,Math.min(count[index3]*3,count[index5]*5));
            System.out.println(count[i]);
        }
        return count[n];
    }
}