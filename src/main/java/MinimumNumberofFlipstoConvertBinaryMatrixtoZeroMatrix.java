import java.util.ArrayList;
import java.util.List;

public class MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix {
    public int minFlips(int[][] mat) {
        if(mat.length==0)
            return 0;
        List<int[][]> matrixList = new ArrayList<>();
        matrixList.add(mat);
        return traceback(matrixList,1);
    }
    public void flips(int[][] mat,int i,int j){
        mat[i][j]=1-mat[i][j];
        if(i>0)
            mat[i-1][j]=1-mat[i-1][j];
        if(i<mat.length-1)
            mat[i+1][j]=1-mat[i+1][j];
        if(j>0)
            mat[i][j-1]=1-mat[i][j-1];
        if(j<mat[0].length-1)
            mat[i][j+1]=1-mat[i][j+1];
    }
    public int traceback(List<int[][]> matrixList,int number){
        int length = matrixList.size();
        for(int index=0;index<length;index++){
            int[][] mat = matrixList.get(0);
            matrixList.remove(0);
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    flips(mat,i,j);
                    if(isZero(mat))
                        return number;
                    else
                        matrixList.add(paste(mat));
                        flips(mat,i,j);
                }
            }
        }
        traceback(matrixList,number++);
        return -1;
    }
    public int[][] paste(int[][] mat){
        int[][] b = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
                b[i][j]=mat[i][j];
        }
        return b;
    }
    public boolean isZero(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(new MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix().minFlips(new int[][] {{0,0},{0,1}}));
    }
}
