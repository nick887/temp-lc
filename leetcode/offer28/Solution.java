package leetcode.offer28;



class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode cp=new TreeNode(root.val);
        copy(root,cp);
        mirror(cp);
        boolean[] booleans=new boolean[1];
        booleans[0]=true;
        contrast(root,cp,booleans);
        return booleans[0];

    }
    void mirror(TreeNode root)
    {
        if(root==null)
            return ;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
    void copy(TreeNode root,TreeNode cp)
    {
        while (root==null)
            return;
        if(root.left!=null)
        cp.left=new TreeNode(root.left.val);
        if(root.right!=null)
        cp.right=new TreeNode(root.right.val);
        copy(root.left,cp.left);
        copy(root.right,cp.right);
    }
    void contrast(TreeNode root,TreeNode cp,boolean[] booleans)
    {
        if(root==null)
            return;
        if(root.val!=cp.val)
            booleans[0]=false;
        contrast(root.left,cp.left,booleans);
        contrast(root.right,cp.right,booleans);
    }
}