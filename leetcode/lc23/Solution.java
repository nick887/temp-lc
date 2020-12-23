package leetcode.lc23;




class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode[] points=new ListNode[lists.length];
        ListNode result=new ListNode();
        ListNode index=result;
        for (int i = 0; i < lists.length; i++) {
            points[i]=lists[i];
        }
        while (min(points)!=-1)
        {
            index=points[min(points)];
            points[min(points)]=index.next;
            index.next=new ListNode();
            index=index.next;
        }
        return result;

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     int min(ListNode[] points)
    {
        int min=Integer.MAX_VALUE;
        int anchor=-1;
        for (int i = 0; i <points.length; i++) {
            if(points[i]==null)
                continue;
            if(min>points[i].val) {
                min = points[i].val;
                anchor=i;
            }
            if(anchor==-1)
                return -1;
        }
        return anchor;
    }

    public static void main(String[] args) {

    }

}