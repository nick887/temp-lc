package leetcode.offer30;

import java.util.Stack;

class MinStack {

    Stack<Integer> a1;
    Stack<Integer> a2;
    /** initialize your data structure here. */
    public MinStack() {
        a1=new Stack<>();
        a2=new Stack<>();
        a2.push(Integer.MAX_VALUE);

    }

    public void push(int x) {
        a1.push(x);
        if(x<a2.peek())
            a2.push(x);
        else
            a2.push(a2.peek());


    }

    public void pop() {
        a2.pop();
        a1.pop();

    }

    public int top() {
        return a1.peek();
    }

    public int min() {
        return a2.peek();
    }
}