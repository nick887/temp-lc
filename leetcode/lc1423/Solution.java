package leetcode.lc1423;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int minSum=0;
        int left=0;
        int right=k;
        int sum=0;
        int temp=0;
        for (int i = 0; i < cardPoints.length; i++) {
            sum+=cardPoints[i];
        }
        for (int i = 0; i < k; i++) {
            minSum+=cardPoints[i];
        }
        while (right<cardPoints.length)
        {
            temp=minSum+cardPoints[right++]-cardPoints[left++];
            if(temp<minSum)
                minSum=temp;
        }
        return sum-minSum;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,16));
    }
}