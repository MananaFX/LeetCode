import java.util.HashMap;

public class WordExistIn2DArray {
    public boolean exist(char[][] board, String word) {
        for(int row=0;row<board.length;row++){
            for(int list=0;list<board[0].length;list++){
                if(board[row][list]==word.charAt(0)){
                    if(findnext(board,row,list,word,0))
                        return true;
                }
            }
        }
        return false;
    }
    public boolean findnext(char[][] board,int row,int list,String word,int point){
        if(row<0||row>=board.length||list<0||list>=board[0].length||board[row][list]!=word.charAt(point))
            return false;
        if(point==word.length()-1)
            return true;
        board[row][list]='\0';
        boolean res=findnext(board,row,list+1,word,point+1)||findnext(board,row,list-1,word,point+1)||findnext(board,row+1,list,word,point+1)||findnext(board,row-1,list,word,point+1);
        board[row][list]=word.charAt(point);
        return res;
    }
}
