package leetcode.lc135;

class Solution {
    public int candy(int[] ratings) {
        int count=1;
        int left=0;
        int right=0;
        int i=0;

        while(i < ratings.length-1) {
            if(ratings[i+1]<=ratings[i])
            {
                for (right = i+1; right < ratings.length; right++) {
                    if(ratings[right]>=ratings[right-1]) {
                        break;
                    }
                }
                right--;
                System.out.println("addAll(i-left+1)-1  "+(addAll(i-left+1)-1));
                System.out.println("right-i+1  "+(right-i));
                if(i-left>=right-i) {
                    count += addAll(i - left + 1) - 1;
                    count += addAll(right - i);
                }
                else
                {
                    if(left>0&&ratings[left]==ratings[left-1])
                        count += addAll(i - left);
                    else
                        count+=addAll(i-left)-1;
                    if (left == 0)
                        count += addAll(right - i + 1) - 1;
                    else
                        count += addAll(right - i + 1);
                }
                if(right<ratings.length-1&&ratings[right]==ratings[right+1]&&right==left)
                    count++;
                if(right<ratings.length-1&&ratings[right]==ratings[right+1])
                    right=right+1;
                left=right;
                i=right;
            }
            else
            {
                i++;
            }

        }
        if(i!=left)
        {
            System.out.println("YES");
            if(left>0&&ratings[left]==ratings[left-1])
                count+=addAll(i-left+1);
            else
                count+=addAll(i-left+1)-1;
        }
        if(ratings[i-1]==ratings[i])
        {
            System.out.println("YES");
            count+=1;
        }

        return count;


    }
    int addAll(int n)
    {
        int count=0;
        for (int i = 1; i <= n; i++) {
            count+=i;
        }
        return count;
    }
}