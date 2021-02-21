package test.sumTest;

public class SumCommon {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis(); //获取开始时间

        //要测的程序或方法



        int sum=0;
        for (int i = 0; i < 1000000; i++) {
               sum+=i;
        }
        System.out.println(sum);
        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
