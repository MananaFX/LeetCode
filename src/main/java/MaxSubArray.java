public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int[] sum = new int[nums.length];
        int max=nums[0];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=Math.max(sum[i-1]+nums[i],nums[i]);
            max=Math.max(sum[i],max);
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(new MaxSubArray().maxSubArray(new int[] {1,-2,3}));
    }
}
