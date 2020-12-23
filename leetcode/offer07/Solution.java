package leetcode.offer07;




class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=new TreeNode(preorder[0]);
        int low=0;
        int high=inorder.length;
        find(low,high,inorder,0,preorder,root);
        return root;
    }
    void find(int low,int high,int[] inorder,Integer n,int[] preorder,TreeNode root)
    {
        int index=0;
        for (int i = low; i < high; i++) {
            if(inorder[i]==preorder[n])
            {
                index=i;
                TreeNode temp=new TreeNode(inorder[i]);
                root=temp;
            }
        }
        if(index==low||index==high)
            return;
        else
        {
            root.left=new TreeNode(0);
            root.right=new TreeNode(0);
        }
        n++;
        find(low,index,inorder,n,preorder,root.left);
        find(index+1,high,inorder,n,preorder, root.right);
    }

}