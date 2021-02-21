package leetcode.offer54;


import java.util.ArrayList;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        rootToArray(root,arrayList);
        return arrayList.get(arrayList.size()-1-k);
    }
    void rootToArray(TreeNode root,ArrayList<Integer> arrayList)
    {
        if(root==null)
            return;
        rootToArray(root.left,arrayList);
        arrayList.add(root.val);
        rootToArray(root.right,arrayList);
    }
}