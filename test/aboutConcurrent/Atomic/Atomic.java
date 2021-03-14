package test.aboutConcurrent.Atomic;

import java.util.concurrent.atomic.AtomicLong;

public class Atomic {
    private static AtomicLong atomicLong=new AtomicLong();
    private static Integer[] arrayOne=new Integer[]{0,1,2,3,4,0,5,6,0,1};
    private static Integer[] arrayTwo=new Integer[]{10,1,2,0,4,0,5,6,0,1};

    public static void main(String[] args)throws InterruptedException {
        Thread threadOne=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrayOne.length; i++) {
                    if(arrayOne[i].intValue()==0)
                        atomicLong.incrementAndGet();
                }
            }
        });
        Thread threadTwo=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrayTwo.length; i++) {
                    if(arrayTwo[i].intValue()==0)
                        atomicLong.incrementAndGet();
                }
            }
        });
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println(atomicLong.get());
    }
}
