package leetcode.offer32;


import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<TreeNode> queue2=new LinkedList<>();
        queue.add(root);
        List<Integer> list=new LinkedList<>();
        List<List<Integer>> lists=new LinkedList<>();
        int x=0;
        while (!queue.isEmpty()||!queue2.isEmpty())
        {
            if(x==0) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (queue.isEmpty()) {
                    x=1;
                    lists.add(list);
                    list = new LinkedList<>();
                }
                if (treeNode.left != null)
                    queue2.add(treeNode.left);
                if (treeNode.right != null)
                    queue2.add(treeNode.right);
            }
            else {
                TreeNode treeNode = queue2.poll();
                list.add(treeNode.val);
                if (queue2.isEmpty()) {
                    x=0;
                    lists.add(list);
                    list = new LinkedList<>();
                }
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
        }
        return lists;
    }
}