package leetcode.offer24;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        ListNode p=head;
        while(p!=null) {
            arrayList.add(p.val);
            p = p.next;
        }
        p=head;
        while(!arrayList.isEmpty())
        {
            p.val=arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
            p=p.next;
        }
        return head;
    }
}
