package leetcode.lc389;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] ints1=new int[26];
        int[] ints2=new int[26];
        for (int i = 0; i < 26; i++) {
            ints1[i]=0;
            ints2[i]=0;
        }
        for (int i = 0; i < s.length(); i++) {
            ints1[(int) s.charAt(i)-97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            ints2[(int) t.charAt(i)-97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (ints1[i]!=ints2[i])
                return (char) (i+97);
        }
        return 'a';
    }
}