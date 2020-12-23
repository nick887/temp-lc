package leetcode.lc714;
import java.util.Stack;

class Solution {
    public static int maxProfit(int[] prices, int fee) {
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for (int i :
                prices) {
            if(stack.isEmpty())
                stack.push(i);
            else
            {
                int temp=stack.pop();

                if(stack.isEmpty())
                {
                    stack.push(temp);
                    stack.push(i);
                }
                else
                {
                    if(i>temp) {
                        stack.push(i);
                    }
                    else
                    {
                        if((temp-stack.peek())>fee) {
                            count += (temp - stack.peek()-fee);
                            stack.pop();
                        }
                        else
                        {
                            stack.push(temp);
                            continue;
                        }

                    }
                }

            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        int temp=stack.pop();
        if(!stack.isEmpty())
            count+=(temp-stack.peek()-fee);
        return count;
    }

    public static void main(String[] args) {
        int[] prices={1,3,2,8,4,9};
        int fee=2;
        Solution.maxProfit(prices,fee);

    }
}