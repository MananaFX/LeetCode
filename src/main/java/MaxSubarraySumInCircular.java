public class MaxSubarraySumInCircular {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] sum = new int[nums.length];
        int max = nums[0];
        int allSum=max;
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(sum[i - 1] + nums[i], nums[i]);
            max = Math.max(sum[i], max);
            allSum+=nums[i];
        }
        int tmp=nums[1];
        int min=tmp;
        for(int i=2;i< nums.length-1;i++){
            tmp=nums[i]+Math.min(0,tmp); //取自己或者与前数之和
            min=Math.min(min,tmp);
        }
        return Math.max(max,allSum-min);
    }
}
