import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int a = 0; a < nums.length - 3; a++) {
            if (a != 0 && nums[a] == nums[a - 1])
                continue;
            if( nums[a] + nums[a+1] + nums[a+2] + nums[a+3] > target ) //剪枝
                continue;
            if( nums[a] + nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3] < target) //剪枝
                continue;
            for (int d = nums.length - 1; d > a + 2; d--) {
                if(nums[a] + nums[d] + nums[a+1] + nums[a+2] > target) //剪枝
                    continue;
                if (d != nums.length - 1 && nums[d] == nums[d + 1])
                    continue;
                int cost = target - nums[a] - nums[d];
                int c = d - 1;
                for (int b = a + 1; b < d - 1; b++) {

                    if(b >= c)
                        break;
                    if (b != a + 1 && nums[b] == nums[b - 1])
                        continue;
                    if (c != d - 1 && nums[c] == nums[c + 1]) {
                        c--;
                        b--;
                        continue;
                    }
                    if (nums[c] + nums[b] < cost)
                        continue;
                    else if (nums[c] + nums[b] > cost){
                        c--;
                        b--;
                    }

                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(nums[c]);
                        list.add(nums[d]);
                        c--;
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String []args){
        System.out.println(new FourSum().fourSum(new int[] {-3,-1,0,2,4,5},0));
    }
}
