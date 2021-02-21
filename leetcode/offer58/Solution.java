package leetcode.offer58;

class Solution {
    public String reverseWords(String s) {
        StringBuffer a=new StringBuffer();
        for(int i=s.length()-1;i>-1;i--)
        {
            if(s.charAt(i)!=' ')
            {
                for(int j=i;j>-1;j--)
                {
                    if(s.charAt(j)==' ')
                    {
                        int temp=j+1;
                        while(temp<=i)
                        {
                            a.append(s.charAt(temp));
                            temp++;
                        }
                        a.append(' ');
                        i=j;
                        break;
                    }
                    else if(j==0)
                    {
                        int temp=j;
                        while(temp<=i)
                        {
                            a.append(s.charAt(temp));
                            temp++;
                        }
                        i=j;
                        break;
                    }
                }
            }
        }
        int index=0;
        for(index=a.length()-1;index>-1;index--)
            if(a.toString().charAt(index)!=' ')
                break;
        return a.toString().substring(0,index+1);

    }
}