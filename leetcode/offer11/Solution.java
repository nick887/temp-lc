package leetcode.offer11;

class Solution {
    public int minArray(int[] numbers) {
        int min=Integer.MAX_VALUE;
        for (int i = numbers.length-1; i >=0 ; i--) {
            if(min<numbers[i])
                min=numbers[i];
            else
                break;
        }
        return min;

    }
}