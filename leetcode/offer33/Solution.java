package leetcode.offer33;

class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return find(postorder,0,postorder.length-1);
    }
    public boolean find(int[] postorder,int bg,int ed)
    {
        if(bg==ed)
            return true;
        int rev=0;
        int root=postorder[ed];
        int bp=ed-1;
        for (int i = ed-1; i >=bg; i--) {
            if(rev==0)
            {
                if(postorder[i]<root)
                {
                    rev=1;
                    bp=i;
                }
            }
            else if(rev==1)
            {
                if(postorder[i]>root)
                    return false;
            }
        }
        return find(postorder,bg,bp)&&find(postorder,bp+1,ed-1);
    }
}