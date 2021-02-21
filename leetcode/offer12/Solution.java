package leetcode.offer12;

class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0))
                {
                    boolean[][] booleans=new boolean[board.length][board[0].length];
                    for (int k = 0; k < booleans.length; k++) {
                        for (int l = 0; l < booleans[0].length; l++) {
                            booleans[k][l]=false;
                        }
                    }
                    if(dfs(board,word,0,i,j,"-1",booleans))
                        return true;
                }

            }
        }
        return false;
    }
    public boolean dfs(char[][]board,String word,int index,int i,int j,String dir,boolean[][] booleans)
    {
        System.out.println(word.charAt(index));
        if(i>=board.length||j>=board[0].length||i<0||j<0||booleans[i][j])
            return false;
        if(board[i][j]==word.charAt(index)&&index==word.length()-1)
            return true;
        else if(board[i][j]==word.charAt(index)&&!(index==word.length()-1))
        {
            index++;
            booleans[i][j]=true;
            if(dir.equals("00")||!dfs(board,word,index,i+1,j,"01",booleans))
            {
                if(dir.equals("10") ||!dfs(board,word,index,i,j+1,"11",booleans))
                {
                    if (dir.equals("01")||!dfs(board,word,index,i-1,j,"00",booleans))
                    {
                        if(dir.equals("11")||!dfs(board,word,index,i,j-1,"10",booleans))
                            return false;
                        else
                            return true;
                    }
                    else
                        return true;
                }
                else return true;
            }
            else
                return true;
        }
        else if(board[i][j]!=word.charAt(index))
        {
            return false;
        }
        return false;
    }
}