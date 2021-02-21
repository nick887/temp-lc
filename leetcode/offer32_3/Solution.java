package leetcode.offer32_3;


import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Deque<TreeNode> queue=new LinkedList<>();
        int reverse=0;
        queue.add(root);
        while (!queue.isEmpty())
        {
            int count=queue.size();
             ArrayList<Integer> temp=new ArrayList<>();
             for (int i = 0; i < count; i++) {
                 TreeNode a=null;
                 switch (reverse)
                 {
                     case 1:
                         a=queue.pollLast();
                         temp.add(a.val);
                         if(a.right!=null)
                             queue.addFirst(a.right);
                         if(a.left!=null)
                             queue.addFirst(a.left);
                         break;
                     case 0:
                         a=queue.pollFirst();
                         temp.add(a.val);
                         if(a.left!=null)
                             queue.addLast(a.left);
                         if(a.right!=null)
                             queue.addLast(a.right);
                         break;

                 }
             }
             res.add(temp);
             switch (reverse)
             {
                 case 1:
                     reverse=0;
                     break;
                 case 0:
                     reverse=1;
                     break;
             }
        }
        return res;
    }
}