package leetcode.test;


public class Solution {


    public static void main(String[] args) {
        Integer n=10;
    }
    void find(Integer n)
    {
        if(n==1)
            return;
        System.out.println(n);
        n--;
        find(n);

    }
}
