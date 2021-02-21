package leetcode.offer38;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] permutation(String s) {
        int a=s.length();
        int res=1;
        for (int i = 1; i <=a; i++) {
            res*=i;
        }
        ArrayList<String> strings=new ArrayList<>();
        int[] count=new int[s.length()];
        StringBuffer temp=new StringBuffer();
        find(strings,count,s,temp);
        String[] re=new String[res];
        re=strings.toArray(re);
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < re.length; i++) {
            if(!hashMap.containsKey(re[i]))
                hashMap.put(re[i],1);
        }
        String[] result=new String[hashMap.size()];
        int i=0;
        for (String ele :
                hashMap.keySet()) {
            result[i++]=ele;
        }
        return result;
    }
    void find(ArrayList<String> strings, int[] count, String s, StringBuffer temp)
    {
        if(temp.toString().length()==s.length()) {
            strings.add(temp.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if(count[i]==0) {
                temp.append(s.charAt(i));
                count[i]=1;
                find(strings,count,s,temp);
                count[i]=0;
                temp.delete(temp.length()-1,temp.length());
            }

        }
    }

    public static void main(String[] args) {
        int [] c=new int[26];
        System.out.println('a'-96);

    }

}