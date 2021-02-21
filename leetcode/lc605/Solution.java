package leetcode.lc605;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=n;
        int i=0;
        while(i<flowerbed.length){
            if(flowerbed[i]==0)
            {
                if(flowerbed[i+1]==0)
                    count--;
            }
            else
            i+=2;
        }
        return count<=0?true:false;
    }
}