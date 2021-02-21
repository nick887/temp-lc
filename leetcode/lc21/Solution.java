package leetcode.lc21;


import java.util.List;

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode p=head;
        while (l1!=null||l2!=null)
        {
            if(l1==null)
            {
                p.val= l2.val;
                p.next=new ListNode();
                p=p.next;
                l2=l2.next;
            }
            if(l2==null)
            {
                p.val=l1.val;
                p.next=new ListNode();
                p=p.next;
                l1=l1.next;
            }
            if(l1!=null&&l2!=null)
            {
                if(l1.val>=l2.val) {
                    p.val = l2.val;
                    p.next=new ListNode();
                    p=p.next;
                    l2=l2.next;
                }
                else
                {
                    p.val=l1.val;
                    p.next=new ListNode();
                    p=p.next;
                    l1=l1.next;
                }
            }
        }
        return head;

    }
}