package leetcode.offer64;

class Solution {
    public int sumNums(int n) {
        boolean flah=n>0&&(n+=sumNums(n-1))>0;
        return n;
    }
}