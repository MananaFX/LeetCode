import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FindRepeatNumber {
    /*******
     * 利用Hashset
     */
    private class number{
        int num;
        public  number (int a) {
            this.num = a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            number number = (number) o;
            return num == number.num;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num);
        }
    }
    public int findRepeatNumber(int[] nums) {
        Set<number> hashset = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(!hashset.add(new number(nums[i])))
                return nums[i];
        }
        return 0;
    }

    /***************
     * 利用交换
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {
        int tmp;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]])
                    return nums[i];
                tmp=nums[nums[i]];nums[nums[i]]=nums[i];nums[i]=tmp;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] nums ={2,3,1,0,2,5,3};
        System.out.println(new FindRepeatNumber().findRepeatNumber2(nums));
    }
}
