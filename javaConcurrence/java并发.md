# java并发
## 1. 基础
### 1.1 线程创建的三种方式
#### 1.1.1 继承Thread类
```java
    import test.serverTest.Server;

public class ThreadTest {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("i am a Thread");
        }
    }
}
```
需要继承自Thread类，需要线程间共享资源时将变量域设为static
#### 1.1.2 实现Runable接口
```java
public class RunableTask extends Runnable
{
    @Override
    public void run()
    {
        System.out.println("i am a runable Thread");
    }

    public static void main(String[] args) {
        Thread thread=Thread(new RunableTask());
        thread.start();
    }
}
```
需要共享变量则在实现Runalbe接口的对象里写入变量即可
#### 