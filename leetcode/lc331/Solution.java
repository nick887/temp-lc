package leetcode.lc331;

import java.util.Stack;

public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<Integer> stack=new Stack<>();
        String[] pre=preorder.split(",");
        if(pre.length==1&&pre[0].equals("#"))
            return true;
        for (int i = 0; i < pre.length; i++) {
            if (stack.isEmpty()) {
                if(pre[i].equals("#"))
                    return false;
                stack.push(0);
            }
            else
            {
                int temp=stack.pop();
                int a;
                if(pre[i].equals("#")) {
                    temp++;
                    if(temp!=2)
                        stack.push(temp);
                }
                else
                {
                    temp++;
                    a=0;
                    if(temp!=2)
                    {
                        stack.push(temp);
                        stack.push(a);
                    }
                    else
                        stack.push(a);
                }
            }
        }
        if(!stack.isEmpty())
        return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String preorder="9,3,4,#,#,1,#,#,2,#,6,#,#";
        String[] pre=preorder.split(",");
        for (String a :
                pre) {
            System.out.println(a);
        }
        System.out.println(pre[3].equals("#"));
    }

}