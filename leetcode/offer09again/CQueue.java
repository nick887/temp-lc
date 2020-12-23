package leetcode.offer09again;

import java.util.LinkedList;
import java.util.Queue;

class CQueue {
    Queue<Integer>queue;
    public CQueue() {
        queue=new LinkedList<>();
    }

    public void appendTail(int value) {
        queue.add(value);
    }

    public int deleteHead() {
        if(queue.isEmpty())
            return -1;
        else
            return queue.poll();
    }
}
