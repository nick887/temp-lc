package leetcode.offer52;


public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengtha=0;
        int lengthb=0;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=null) {
            lengtha++;
            a=a.next;
        }
        while(b!=null) {
            lengthb++;
            b=b.next;
        }
        a=headA;
        b=headB;
        if(lengthb>lengtha)
        {
            for (int i = 0; i < lengthb-lengtha; i++) {
                b=b.next;
            }
        }
        else if(lengtha>lengthb)
        {
            for (int i = 0; i < lengtha - lengthb; i++) {
                a=a.next;
            }
        }
        while(a!=null)
        {
            if(a==b)
                return a;
            a=a.next;
            b=b.next;
        }
        return null;

    }
}