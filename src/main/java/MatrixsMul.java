public class MatrixsMul {
    public int[] solution(int rowA,int colA, int colB,int[] a,int[] b){
        int[] ans  = new int[rowA*colB];
        int n = 0;
        for(int i = 0; i<rowA; i++){
            for(int j = 0; j<colB ; j++){
                for(int z = 0 ; z<colA ;z++){
                    ans[n]=a[rowA*i+z]*b[colB*j+z];
                    n++;
                }
            }
        }
        return ans;
    }
}
