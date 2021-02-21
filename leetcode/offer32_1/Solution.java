package leetcode.offer32_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }

class Solution {
    public int[] levelOrder(TreeNode root) {
        int[] nodeVal=new int[1000];
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int index=0;
        while (!queue.isEmpty())
        {
            TreeNode temp=queue.poll();
            nodeVal[index++]=temp.val;
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        int[] res=new int[index-1];
        res=Arrays.copyOfRange(nodeVal,0,index);
        return res;
    }
}