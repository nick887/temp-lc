package leetcode.offer59_2;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {
    private Queue<Integer> queue;
    private Queue<Integer> maxQueue;
    int max=Integer.MIN_VALUE;
    public MaxQueue() {
        queue=new LinkedList<>();
        maxQueue=new LinkedList<>();
    }

    public int max_value() {
        if(maxQueue.isEmpty())
            return -1;
        return maxQueue.peek();
    }

    public void push_back(int value) {
        if(value>max) {
            max=value;
            maxQueue.add(value);
        }
        else
            maxQueue.add(max);
    }

    public int pop_front() {
        if(queue.isEmpty())
            return -1;
        return 0;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */