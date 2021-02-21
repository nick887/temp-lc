package leetcode.lc989;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        Stack<Integer> stack=new Stack<>();
        int weight=10;
        while (K/(weight/10)!=0)
        {
            stack.push((K%weight)/(weight/10));
            weight*=10;
        }
        int[] num=new int[stack.size()];
        int i=0;
        while (!stack.isEmpty())
        {
            num[i++]=stack.pop();
        }

        int j=A.length-1;
        i=num.length-1;
        int borrow=0;
        List<Integer>list=new LinkedList<>();
        while (i>-1&&j>-1)
        {
            int temp;
            if(i>-1&&j>-1)
                temp=num[i--]+A[j--];
            else if (j>-1)
                temp=A[j--];
            else
                temp=num[i--];
            if(borrow>0) {
                temp += borrow;
                borrow=0;
            }
            if(temp>9)
            {
                temp%=10;
                borrow+=temp/10;
            }
            list.add(0,temp);
        }
        return list;
    }

    public static void main(String[] args) {
    }
}