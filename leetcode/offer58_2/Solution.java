package leetcode.offer58_2;

class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuffer a=new StringBuffer();
        for (int i = n; i < s.length(); i++) {
           a.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            a.append(s.charAt(i));
        }
        return a.toString();

    }
}