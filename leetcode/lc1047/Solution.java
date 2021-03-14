package leetcode.lc1047;

import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public String removeDuplicates(String S) {
        LinkedList<Character> linkedList=new LinkedList<>();
        for (int i = 0; i <S.length(); i++) {
            if(linkedList.isEmpty())
                linkedList.addLast(S.charAt(i));
            else
            {
                if(S.charAt(i)==linkedList.peekLast())
                    linkedList.pollLast();
                else
                    linkedList.addLast(S.charAt(i));
            }
        }
        StringBuilder stringBuffer=new StringBuilder();
        while (!linkedList.isEmpty())
        {
            stringBuffer.append(linkedList.pollFirst());
        }
        return stringBuffer.toString();
    }
}