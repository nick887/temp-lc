package leetcode.lc205;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> hashMap1=new HashMap<>();
        HashMap<Character,Character> hashMap2=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hashMap1.containsKey(s.charAt(i)))
            {
                if(hashMap1.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else if(hashMap2.containsKey(t.charAt(i))){
                if(hashMap2.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
            else
                hashMap1.put(s.charAt(i),t.charAt(i));
                hashMap2.put(t.charAt(i),s.charAt(i));
        }

        return true;
    }
}