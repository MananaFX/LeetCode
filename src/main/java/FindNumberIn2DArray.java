public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int row=0;
        int line=matrix[0].length-1;
        while(row<matrix.length && line>=0){
            if(matrix[row][line]<target)
                row++;
            else if(matrix[row][line]>target)
                line--;
            else
                return true;
        }
        return false;
    }
}
