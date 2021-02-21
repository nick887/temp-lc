package test.serverTest;

import java.util.concurrent.ThreadPoolExecutor;

public class Task implements Runnable{
    private String name;
    public Task(String name)
    {
        this.name=name;
    }

    @Override
    public void run() {
        try{
            Long duration=(long) (Math.random()*1000);
            System.out.println(Thread.currentThread().getName()+"  "+duration);
            Thread.sleep(duration);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
