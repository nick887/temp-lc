package leetcode.offer25;



class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode p=head;
        while(l1!=null||l2!=null)
        {
            if(l1==null)
            {
                ListNode temp=new ListNode(l2.val);
                p.next=temp;
                l2=l2.next;
            }
            else
                if (l2==null)
                {
                    ListNode temp=new ListNode(l1.val);
                    p.next=temp;
                    l1=l1.next;
                }
                else
                if (l2!=null&&l1!=null)
                {
                    ListNode temp=new ListNode(Math.max(l1.val, l2.val));
                    p.next=temp;
                    if(l1.val> l2.val)
                        l2=l2.next;
                    else
                        l1=l1.next;
                }
        }
        return head.next;
    }
}