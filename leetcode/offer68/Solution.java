package leetcode.offer68;


import java.util.LinkedList;
import java.util.Stack;

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
        createStack(root,linkedList1,p);
        createStack(root,linkedList2,q);
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
    void createStack(TreeNode node,LinkedList<TreeNode> linkedList,TreeNode find)
    {
        if(node==null)
            return;
        linkedList.add(node);
        if(node==find)
            return;
        if(node.val>find.val)
            createStack(node.right,linkedList,find);
        if(node.val<find.val)
            createStack(node.left,linkedList,find);
    }
}