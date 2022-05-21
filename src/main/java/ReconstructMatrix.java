import java.util.ArrayList;
import java.util.List;

public class ReconstructMatrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<Integer> up = new ArrayList<>();
        List<Integer> down = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<colsum.length;i++){
            if(colsum[i]==2){
                upper--;
                lower--;
            }
        }
        for(int i=0;i<colsum.length;i++){
            if(colsum[i]==2){
                up.add(1);
                down.add(1);
            }else if(colsum[i]==0){
                up.add(0);
                down.add(0);
            }else{
                if(upper!=0){
                    up.add(1);
                    down.add(0);
                    upper--;
                }else{
                    up.add(0);
                    down.add(1);
                    lower--;
                }
            }
        }
        if(lower!=0)
            return ans;
        else{
            ans.add(up);
            ans.add(down);
            return ans;
        }
    }
}
