package leetcode.offer17;

class Solution {
    public int[] printNumbers(int n) {
        int [] ints=new int[(int)Math.pow(10,n)];
        for (int i = 1; i < (int) Math.pow(10,n); i++) {
            ints[i]=i;
        }
        return ints;
    }
}