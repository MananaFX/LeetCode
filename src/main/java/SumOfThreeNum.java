import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThreeNum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 3 )
            return ans;
        for(int i = 0 ; i < nums.length-2 ; i++){
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            if(nums[i] >0)
                break;
            int j = i+1;
            int z = nums.length-1;
            while(j < nums.length-1 && z > j){
                if(j != i+1 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }

                if(z != nums.length-1 && nums[z] == nums[z+1]){
                    z--;
                    continue;
                }

                if(nums[i]+nums[j]+nums[z] > 0){
                    z--;
                    continue;
                }else if(nums[i]+nums[j]+nums[z] < 0){
                    j++;
                    continue;
                }else{
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[z]);
                    ans.add(tmp);
                    j++;
                    z--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(new SumOfThreeNum().threeSum(new int[] {0,0,0}));
    }
}
