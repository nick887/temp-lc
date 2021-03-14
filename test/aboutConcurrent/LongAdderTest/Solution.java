package test.aboutConcurrent.LongAdderTest;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;

public class Solution {
    public static void main(String[] args)throws Exception {
        LongAdder a=new LongAdder();
        AtomicLong a1=new AtomicLong();
        Thread one=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    a.increment();
                }
            }
        });
        Thread two=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    a.increment();
                }

            }
        });
        long start1=System.currentTimeMillis();
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println(a.sum());
        long end1=System.currentTimeMillis();
        Thread one2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    a1.incrementAndGet();
                }
            }
        });
        Thread two2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    a1.incrementAndGet();
                }
            }
        });
        long start2=System.currentTimeMillis();
        one2.start();
        two2.start();
        one2.join();
        two2.join();
        long end2=System.currentTimeMillis();
        System.out.println("time1: "+(end1-start1));
        System.out.println("time2: "+(end2-start2));
        LongAccumulator accumulator=new LongAccumulator(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left+right;
            }
        },0);
        accumulator.accumulate(12L);
    }
}
