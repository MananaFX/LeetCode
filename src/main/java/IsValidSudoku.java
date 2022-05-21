import java.util.HashSet;

public class IsValidSudoku {
    /***
     输入：
     [[".",".",".",".",".",".","5",".","."],
     [".",".",".",".",".",".",".",".","."],
     [".",".",".",".",".",".",".",".","."],
     ["9","3",".",".","2",".","4",".","."],
     [".",".","7",".",".",".","3",".","."],
     [".",".",".",".",".",".",".",".","."],
     [".",".",".","3","4",".",".",".","."],
     [".",".",".",".",".","3",".",".","."],
     [".",".",".",".",".","5","2",".","."]]
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        char[][] boardT = new char[board.length][board[0].length];
        char[] board1 = new char[9];
        char[] board2 = new char[9];
        char[] board3 = new char[9];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for(int i = 0 ; i < board.length ; i++){ //行
            if( i!=0 && i%3 == 0){
                if(!(isValidNine(board1) && isValidNine(board2) && isValidNine(board3) ))
                    return false;
                index1 = 0;
                index2 = 0;
                index3 = 0;
            }

            for(int j = 0 ; j < board[0].length ; j++ ){
                boardT[j][i]=board[i][j];
                if(j<3)
                    board1[index1++] = board[i][j];
                else if(j<6)
                    board2[index2++] = board[i][j];
                else
                    board3[index3++] = board[i][j];
            }
            if (!isValidNine(board[i]))
                return false;
        }
        if(!(isValidNine(board1) && isValidNine(board2) && isValidNine(board3) ))
            return false;
        for(int i = 0 ; i < board.length ;i++ ){ //列
            if(!isValidNine(boardT[i]))
                return false;
        }
        return true;
    }
    public boolean isValidNine(char[] nineBoard){
        HashSet hashSet = new HashSet();
        for(int i = 0 ; i < nineBoard.length ;i++){
            if(nineBoard[i] != '.'){
                if(!hashSet.add(nineBoard[i]))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(new IsValidSudoku().isValidSudoku(new char[][] {{'.','.','4','.','.','.','6','3','.'},{'.','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},{'4','.','3','.','.','.','.','.','1'},{'.','.','.','7','.','.','.','.','.'},{'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}}));
    }
}
