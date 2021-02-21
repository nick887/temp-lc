package leetcode.offer26;


import java.util.LinkedList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        LinkedList<TreeNode> sameRoot=new LinkedList<>();
        findRoot(A,B.val,sameRoot);
        while (!sameRoot.isEmpty())
        {
            if(ite(sameRoot.poll(),B)==true)
                return true;
        }
        return false;
    }
    public static boolean ite(TreeNode A,TreeNode B)
    {
            if(A==null&&B!=null||A!=null&&B==null)
            {
                return false;
            }
            if(A==null&&B==null)
                return true;
            if(A.val!=B.val) {
                return false;
            }
            else {
                return ite(A.left, B.left) && ite(A.right, B.right);
            }
    }
    public static void findRoot(TreeNode A,int val,LinkedList<TreeNode> sameRoot)
    {
        if(A==null)
            return;
        if(A.val==val)
            sameRoot.add(A);
        findRoot(A.left,val,sameRoot);
        findRoot(A.right,val,sameRoot);
    }
}