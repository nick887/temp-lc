package leetcode.lc721;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,HashMap<Integer,List<String>>> hashMap=new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            if(!hashMap.containsKey(accounts.get(i).get(0)))
            {
                HashMap<Integer,List<String>> temp=new HashMap<>();
                List<String> b=accounts.get(i).subList(1,accounts.get(i).size());
                b = b.stream().distinct().collect(Collectors.toList());
                temp.put(temp.size(),b);//放入除名字外的邮箱
                System.out.println(temp.get(temp.size()-1).toString());
                hashMap.put(accounts.get(i).get(0),temp);//放入hash表
            }
            else
            {
                int tempInteger=-1;
                List<Integer> moveInt=new LinkedList<>();
                List<List<String>> cross=new LinkedList<>();
                HashMap<Integer,List<String>> temp=hashMap.get(accounts.get(i).get(0));//获得hash表子表
                boolean isContain=false;
                for (Map.Entry<Integer,List<String>> entry://获得子表中各元素
                     temp.entrySet()) {
                    for (int j = 1; j < accounts.get(i).size(); j++) {//获得当前遍历对象的各个字符串值
                        String a=accounts.get(i).get(j);
                        if (entry.getValue().contains(a)) {//如果子表中元素包含当前遍历对象字符
                            moveInt.add(entry.getKey());
                            cross.add(entry.getValue());
                            isContain=true;
                        }
                    }

                }
                if(!isContain)
                {
                    List<String> b=accounts.get(i).subList(1,accounts.get(i).size());
                    b = b.stream().distinct().collect(Collectors.toList());
                    temp.put(temp.size(),b);//不一样则加入子表
                    System.out.println("不存在匹配对象，加入：  "+b.toString());
                }
                else
                {
                    tempInteger=moveInt.get(0);
                    for (Integer a :
                            moveInt) {
                        System.out.println("移除对象： "+temp.get(a).toString());
                        temp.remove(a);
                    }
                    List<String > list1=new LinkedList<>();
                    for (List<String > list:
                         cross) {
                                       list1.addAll(list);
                    }
                    list1.addAll(accounts.get(i).subList(1,accounts.get(i).size()));
                    List<String> b=new ArrayList<String>(new HashSet<>(list1));//去重
                    temp.put(tempInteger,b);//加入子表

                }
            }
        }
        List<List<String >> result=new LinkedList<>();
        for (Map.Entry<String ,HashMap<Integer,List<String>>> entry1:
             hashMap.entrySet()) {
            for (Map.Entry<Integer, List<String>> entry2 :
                    entry1.getValue().entrySet()) {
                List<String> list=entry2.getValue();
                Collections.sort(list);
                list.add(0,entry1.getKey());
                result.add(list);
                }

            }
        return result;
        }
    }
