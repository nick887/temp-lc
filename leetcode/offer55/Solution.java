package leetcode.offer55;




class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class bool
    {
        boolean val;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(depth(root.left)-depth(root.right))>1)
            return false;
        if (root.left!=null)
            isBalanced(root.left);
        if(root.right!=null)
            isBalanced(root.right);
        return true;
    }
    int depth(TreeNode treeNode)
    {
        if(treeNode==null)
            return 0;
        return Math.max(depth(treeNode.left),depth(treeNode.right))+1;
    }
}