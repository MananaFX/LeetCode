import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * registration complete
 * illegal length
 * acount existed
 * illegal charactor
 */
public class mianshi11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0 ; i < n ; i++){
            String[] numStr = scanner.nextLine().split(" ");
            int[] nums = new int[numStr.length];
            for( int j = 0 ; j< nums.length ; j++){
                nums[j] = Integer.parseInt(numStr[j]);
            }
            Arrays.sort(nums);
            int ans = 0;
            while(nums[1] > 0 && nums[2]>0 && nums[3]>0 && nums[4]>0 ){
                int tmp=0;
                nums[1]-=tmp;
                nums[2]-=tmp;
                nums[3]-=tmp;
                nums[4]-=tmp;
                ans+=nums[1];
                Arrays.sort(nums);
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
