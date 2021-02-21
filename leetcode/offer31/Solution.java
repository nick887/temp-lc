package leetcode.offer31;

import javax.print.DocFlavor;
import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int push=0,pop=0;
        while (pop<popped.length)
        {
            if(!stack.isEmpty()&&stack.peek()==popped[pop])
            {
                stack.pop();
                push++;
                pop++;
            }
            else
            {
                if(push>=pushed.length)
                    return false;
                stack.push(pushed[push++]);
            }
        }
        return true;
    }
}