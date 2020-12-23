package leetcode.lc103;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists=new LinkedList<>();
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        if(root==null)
            return lists;
        stack1.push(root);
        while(!stack1.isEmpty()||!stack2.isEmpty())
        {
            if(!stack1.isEmpty())
            {
                List<Integer> list=new LinkedList<>();
                while(!stack1.isEmpty()) {
                    TreeNode treeNode = stack1.pop();
                    if(treeNode.left!=null)
                        stack2.push(treeNode.left);
                    if(treeNode.right!=null)
                        stack2.push(treeNode.right);
                    list.add(treeNode.val);
                }
                lists.add(list);
            }
            else
            {
                List<Integer> list=new LinkedList<>();
                while (!stack2.isEmpty())
                {
                    TreeNode treeNode=stack2.pop();
                    if(treeNode.right!=null)
                        stack1.push(treeNode.right);
                    if(treeNode.left!=null)
                        stack1.push(treeNode.left);
                    list.add(treeNode.val);
                }
                lists.add(list);
            }
        }
        return lists;

    }
}