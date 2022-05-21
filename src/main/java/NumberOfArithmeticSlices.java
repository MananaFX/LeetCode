public class NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<2)
            return 0;
        int[] sum=new int[nums.length];
        int result=0;
        sum[0]=0;
        sum[1]=0;
        for(int i=2;i< nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
                sum[i]=sum[i-1]+1;
            else
                sum[i]=0;
            result+=sum[i];
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(new NumberOfArithmeticSlices().numberOfArithmeticSlices(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}));
    }
}
