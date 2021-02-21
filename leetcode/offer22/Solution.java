package leetcode.offer22;




class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count=0;
        int x=0;
        ListNode p=head;
        while (p!=null)
        {
            count++;
            p=p.next;
        }
        p=head;
        while (x!=count-2)
        {
            x++;
            p=p.next;
        }
        return p;
    }
}