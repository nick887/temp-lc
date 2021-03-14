package leetcode.lc227;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                int begin = index;
                while (s.charAt(index) >= '0' && s.charAt(index) <= '9')
                    index++;
                int temp = Integer.parseInt(s.substring(begin, index));
                stack.push(temp);
            } else if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            }
        }
        return -1;
    }
}