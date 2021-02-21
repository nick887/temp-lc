package leetcode.offer68_2;

import java.util.LinkedList;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> linkedList1=new LinkedList<>();
        LinkedList<TreeNode> linkedList2=new LinkedList<>();
        createlinkedlist(root,linkedList1,p);
        createlinkedlist(root,linkedList2,q);
        linkedList1.addFirst(p);
        linkedList2.addFirst(q);
        while (linkedList1.size()!=linkedList2.size())
        {
            if(linkedList1.size()>linkedList2.size())
                linkedList1.removeLast();
            else
                linkedList2.removeLast();
        }
        while (linkedList1.peekLast()!=linkedList2.peekLast())
        {
            linkedList1.removeLast();
            linkedList2.removeLast();
        }
        return linkedList1.peekLast();

    }
    boolean createlinkedlist(TreeNode node,LinkedList<TreeNode> linkedList,TreeNode find)
    {
        if(node==null)
            return false;
        if(node==find)
            return true;
       if(createlinkedlist(node.left,linkedList,find)) {
           linkedList.add(node);
           return true;
       }
       if(createlinkedlist(node.right,linkedList,find)) {
           linkedList.add(node);
           return true;
       }
       return false;
    }
}