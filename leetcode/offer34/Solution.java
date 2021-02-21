package leetcode.offer34;


import java.util.LinkedList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new LinkedList<>();
        LinkedList<Integer> temp=new LinkedList<>();
        if(root==null)
            return res;
        int count=0;
        find(root,sum,res,count,temp);
        return res;

    }
    void find(TreeNode root, int sum, List<List<Integer>> res,int count,List<Integer> temp)
    {
        if(root==null)
            return;
        count+=root.val;
        temp.add(root.val);
        if(root.right==null&&root.left==null)
        {
            if(count==sum)
                res.add(temp);
        }
        List<Integer> cp=new LinkedList<>();
        for (Integer i:
                temp) {
            cp.add(i);
        }
        if(root.left!=null)
            find(root.left,sum,res,count,temp);
        if(root.right!=null)
        {

            find(root.right,sum,res,count,cp);
        }
    }
}