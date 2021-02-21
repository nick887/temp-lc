package leetcode.offer50;

class Solution {
    public char firstUniqChar(String s) {
        int[] counts=new int[26];
        char ch=' ';
        for (int i = 0; i < s.length(); i++) {
            counts[(int)s.charAt(i)-97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(counts[(int)s.charAt(i)-97]==1)
            {
                ch=s.charAt(i);
                break;
            }
        }
        return ch;
    }
}