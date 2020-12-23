package leetcode.lc316;

import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {

        StringBuilder stringBuilder=new StringBuilder();
        LinkedList<Character> linkedList=new LinkedList<>();
        int[] count=new int[26];
        boolean[] inStack=new boolean[26];
        for (int i = 0; i < 26; i++) {
            count[i]=0;
            inStack[i]=false;
        }
        for (int i = 0; i < s.length(); i++) {
            count[(int)s.charAt(i)-97]++;
        }
        int index=0;
        for (int i = index; i < s.length(); i++) {
                if(linkedList.isEmpty()) {
                    linkedList.add(s.charAt(i));
                    inStack[(int) s.charAt(i)-97]=true;
                    count[(int) s.charAt(i)-97]--;
                }
                else if (linkedList.peekLast()<s.charAt(i))
                {
                        if(inStack[(int) s.charAt(i)-97]==true)
                            count[(int) s.charAt(i)-97]--;
                        else {
                            count[(int) s.charAt(i) - 97]--;
                            inStack[(int) s.charAt(i) - 97] = true;
                            linkedList.add(s.charAt(i));
                        }

                }
                else if (linkedList.peekLast()>=s.charAt(i))

                {
                    if(inStack[(int) s.charAt(i)-97]==true)
                        count[(int) s.charAt(i)-97]--;
                    else {
                        while ((!linkedList.isEmpty()) && linkedList.peekLast() >= s.charAt(i)) {
                            inStack[(int)linkedList.pollLast()-97]=false;

                        }
                        linkedList.add(s.charAt(i));
                        inStack[(int) s.charAt(i)-97]=true;
                        count[(int) s.charAt(i) - 97]--;
                    }
                }
                

        }
            while (!linkedList.isEmpty()) {
                stringBuilder.append(linkedList.pollFirst());
            }
        return stringBuilder.toString();

    }
}