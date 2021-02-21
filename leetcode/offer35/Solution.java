package leetcode.offer35;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        HashMap<Node,Node> hashMap=new HashMap<>();
        Node p=head.next;
        Node res=new Node(head.val);
        hashMap.put(head, res);
        Node temp=res;
        while (p!=null)
        {
            temp.next=new Node(p.val);
            temp=temp.next;
            hashMap.put(p, temp);
            p=p.next;
        }
        p=head;
        temp=res;
        while (p!=null)
        {
            if(p.random==null)
                temp.random=null;
            else
            temp.random=hashMap.get(p.random);

            temp=temp.next;
            p=p.next;
        }
        return res;
    }
}