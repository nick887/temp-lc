package leetcode.lc224;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int sign=1;
        s=s.replaceAll(" ","");
        int res=0;
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while (i<s.length()){
            if(s.charAt(i)=='('&&i==0) {
                stack.push(1);
                i++;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'&&i>0)
            {
                int begin=i;
                while (i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9')
                    i++;
                int temp=Integer.parseInt(s.substring(begin,i));
                if(!stack.isEmpty())
                {
                    if(s.charAt(begin-1)!='(')
                    res+=(stack.peek()*(s.charAt(begin-1)=='+'?1:-1)*temp);
                    else
                        res+=temp;
                }
                else
                {
                    res += (s.charAt(i - 1) == '+' ? 1 : -1) * temp;
                }
                System.out.println(res);
            }
            else if(s.charAt(i)=='('&&i>0)
            {
                if(!stack.isEmpty())
                stack.push((s.charAt(i-1)=='+'?1:-1)*stack.peek());
                else
                    stack.push(s.charAt(i-1)=='+'?1:-1);
                i++;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'&&i==0)
            {
                while (i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9')
                    i++;
                res+=Integer.parseInt(s.substring(0,i));

            }
            else if(s.charAt(i)==')') {
                stack.pop();
                i++;
            }
            else if(s.charAt(i)=='+'||s.charAt(i)=='-') {
                i++;
                continue;
            }
        }
        if(s.length()>1)
        return res*(s.charAt(0)=='-'&&s.charAt(1)=='('?-1:1);
        else
            return res;
    }

    public static void main(String[] args) {
        String a="1 2 3 4 5";
        a=a.replaceAll(" ","");
        System.out.println(Integer.parseInt(a.substring(0,1)));
    }
}