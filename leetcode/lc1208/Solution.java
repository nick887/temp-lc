package leetcode.lc1208;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int begin=0,end=0;
        int sum=0;
        int maxLength=-1;
        for (; begin < s.length(); begin++) {
            end=begin;
            for (; end < s.length(); end++) {
                sum+=Math.abs(s.charAt(end)-t.charAt(end));
                if(sum>maxCost)
                    break;
            }
            maxLength=Math.max(maxLength,end-begin);
        }
    return maxLength;
    }
}