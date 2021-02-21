package leetcode.offer36;

import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
class Solution {
    public Node treeToDoublyList(Node root) {
        LinkedList<Node>list=new LinkedList<>();
        creat(list,root);
        Node head=list.peek();
        head.left=list.peekLast();
        list.peekLast().right=head;
        while (!list.isEmpty())
        {
            Node temp=list.pollFirst();
            if(list.isEmpty())
                break;
            temp.right=list.peekFirst();
            temp.right.left=temp;

        }
        return head;
    }
    void creat(LinkedList<Node> ls,Node root)
    {
        if(root==null)
            return;
        creat(ls,root.left);
        ls.add(root);
        creat(ls,root.right);
    }
}