package test.sumTest;

import test.serverTest.Server;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumTest {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis(); //获取开始时间

        //要测的程序或方法



        ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        List<Future<Integer>> resultList=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            SumTask calculator =new SumTask(i*10000+1,(i+1)*10000);
            Future<Integer> result=executor.submit(calculator);
            resultList.add(result);
        }
        do {
            System.out.println("have finished : "+executor.getCompletedTaskCount());
            for (int i = 0; i < resultList.size(); i++) {
                Future<Integer> result=resultList.get(i);
                System.out.println("main: Task "+i+" " +result.isDone());
            }
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }while (executor.getCompletedTaskCount()<resultList.size());


        int total=0;
        for (int i = 0; i < resultList.size(); i++) {
            Future<Integer> result=resultList.get(i);
            Integer sum=null;
            try {
                sum=result.get();
                total=total+sum;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            catch (ExecutionException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("the total is "+total);
        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
