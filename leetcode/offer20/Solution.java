package leetcode.offer20;

class Solution {
    public boolean isNumber(String s) {
        if (s.length() == 0)
            return false;
        boolean dotFlag=false;
        boolean eFlag=false;
        int dotNum=0;
        int start = 0;
        int end = s.length() - 1;
        while (end >= 0 && start < s.length() && (s.charAt(start) == ' ' || s.charAt(end) == ' ')) {
            if (s.charAt(start) == ' ')
                start++;
            if (s.charAt(end) == ' ')
                end--;
        }
        if (start >= s.length() || end < 0 || start > end)
            return false;
        System.out.println("yes");
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if(i==end)
                    return false;
                else if(i==start) {
                    if (!(s.charAt(i + 1) == '.' || s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))
                        return false;
                }
                else if(!(s.charAt(i-1)=='e'||s.charAt(i-1)=='E')&&!(s.charAt(i+1)=='.'||s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'))
                    return false;
            }
            else if(s.charAt(i)=='e'||s.charAt(i)=='E')
            {
                if(eFlag==true)
                    return false;
                if(i==start)
                    return false;
                else if(i==end)
                    return false;
                else if(!((s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')&&(s.charAt(i+1)=='+'||s.charAt(i+1)=='-'||s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')))
                    return false;
                dotFlag=true;
                eFlag=true;
            }
            else if(s.charAt(i)=='.')
            {
                if(dotFlag==true)
                    return false;
                if(i==start) {
                    if (end == start)
                        return false;
                    else if (!(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))
                        return false;
                }
                else if(i==end) {
                    if (!(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))
                        return false;
                }
                else if(!((s.charAt(i-1)=='+'||s.charAt(i-1)=='-'||s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')&&(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')))
                    return false;
                dotFlag=true;
            }
            else if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
                return false;
        }
        return true;
    }
}