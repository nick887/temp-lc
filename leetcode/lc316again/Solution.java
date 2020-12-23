package leetcode.lc316again;

class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        int[] count=new int[26];
        for (int i = 0; i < 26; i++) {
            count[i]=0;
        }
        for (int i = 0; i < s.length(); i++) {
            if(count[(int)s.charAt(i)-97]==1)
                continue;
            else
            count[(int)s.charAt(i)-97]++;
        }
        int index=0;
        boolean exist=false;
        for (int i = index; i < s.length(); i++) {
            if(count[(int) s.charAt(i)-97]==1)
            {
                for (int j = (int) s.charAt(i)-98; j >-1 ; j--) {
                    if(count[j]>0)
                        exist=false;
                }
                exist=true;
                if(exist)
                {
                    stringBuilder.append(s.charAt(i));
                    count[(int) s.charAt(i)-97]=0;
                }
            }
            else
                continue;
        }
        return stringBuilder.toString();
    }
}