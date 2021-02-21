package leetcode.lc1208_2;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int begin=0,end=0;
        int sum=0;
        boolean forward=true;
        int maxLength=0;
        while (end<s.length())
        {
            sum+=Math.abs(s.charAt(end)-t.charAt(end));
            end++;
            while (sum>maxCost)
            {
                sum-=Math.abs(s.charAt(begin)-t.charAt(begin));
                begin++;
            }
            maxLength=Math.max(maxLength,end-begin);
        }
        return maxLength;
    }
}