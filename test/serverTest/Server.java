package test.serverTest;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Server {
    private ThreadPoolExecutor executor;
    public Server(){
        executor=(ThreadPoolExecutor) Executors.newCachedThreadPool();
    }
    public void submitTask(Task task)
    {
        System.out.println("Server : new task");
        executor.execute(task);
        System.out.println("Pool Size: "+executor.getPoolSize());
        System.out.println("Active Account "+executor.getActiveCount());
        System.out.println("Completed Tasks "+executor.getCompletedTaskCount());
    }
    public void endServer(){
        executor.shutdown();
    }
}
