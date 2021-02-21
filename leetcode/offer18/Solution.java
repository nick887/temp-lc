package leetcode.offer18;


class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p=new ListNode(0);
        ListNode p2=p;
        p.next=head;
        while (p!=null&&p.next!=null)
        {
            if(p.next.val==val)
                p.next=p.next.next;
            p=p.next;
        }
        p2=p2.next;
        return p2;
    }
}