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
        Integer n=0;
        find(low,high,inorder,n,preorder,root);
        return root;
    }
    void find(int low,int high,int[] inorder,Integer n,int[] preorder,TreeNode root)
    {
        if(low>=high)
            return;
        else
        {
            root.left=new TreeNode(0);
            root.right=new TreeNode(0);
        }
        int index=0;
        for (int i = low; i < high; i++) {
            if(inorder[i]==preorder[n])
            {
                index=i;
                TreeNode temp=new TreeNode(inorder[i]);
                root=temp;
            }
        }
        n++;
        find(low,index,inorder,n,preorder,root.left);
        find(index+1,high,inorder,n,preorder, root.right);
    }

}