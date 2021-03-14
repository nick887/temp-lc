package leetcode.lc303_2;

class NumArray {
    private int[] nums;
    private int[] a;
    public NumArray(int[] nums) {
        a=new int[nums.length];
        this.nums=nums;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            a[i]=sum;
        }
    }

    public int sumRange(int i, int j){
        if(i==0)
            return a[j];
        else
        return a[j]-a[i];
    }
}