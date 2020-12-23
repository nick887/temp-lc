package leetcode.lc387;

class Solution {
    public int firstUniqChar(String s) {
        int[] counts=new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[(int)s.charAt(i)-97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(counts[(int)s.charAt(i)-97]==1)
                return i;
        }
        return -1;
    }
}