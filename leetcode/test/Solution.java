package leetcode.test;


public class Solution {


    public static void main(String[] args) {
        class Node{
            int val;
            Node next;
        }
        Node[] lists=new Node[2];
        Node p1=lists[0];
        Node p2=lists[1];
        for (int i = 0; i < 5; i++) {
            Node temp=p1;
            p1=new Node();
            p1.val=i;
            temp.next=p1;
            Node temp1=p2;
            p2=new Node();
            p2.val=5-i;
            temp1.next=p2;
        }
        while(p1!=null&&p2!=null)
        {
            System.out.println(p1.val);
            System.out.print("   "+p2.val);
            p1=p1.next;
            p2=p2.next;
        }
    }
}
