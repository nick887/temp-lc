package leetcode.offer51_1;


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue <TreeNode> queue1=new LinkedList<>();
        Queue <TreeNode> queue2=new LinkedList<>();
        queue1.add(root);
        int choose=0;
        int height=0;
        TreeNode temp;
        while(!queue1.isEmpty()||!queue2.isEmpty())
        {
            if(choose==0) {
                temp = queue1.poll();
                if(queue1.isEmpty()) {
                    height++;
                    choose=1;
                }
                if(temp.left!=null)
                    queue2.add(temp.left);
                if(temp.right!=null)
                    queue2.add(temp.right);
            }
            if(choose==1) {
                temp = queue2.poll();
                if(queue2.isEmpty()) {
                    height++;
                    choose=0;
                }
                if(temp.left!=null)
                    queue1.add(temp.left);
                if(temp.right!=null)
                    queue1.add(temp.right);
            }
        }
        return height;

    }
}