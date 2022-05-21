public class GetMaxLenMulArray {
    public int getMaxLen(int[] nums) {
        int[] positive = new int[nums.length];
        int[] negative = new int[nums.length];
        int max=0;
        if(nums[0]>0)
            positive[0]=1;
        else if(nums[0]<0)
            negative[0]=1;
        if(nums.length==1)
            return positive[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>0){
                positive[i]=positive[i-1]+1;
                negative[i]=negative[i-1]!=0?negative[i-1]+1:0;
            }else if(nums[i]<0){
                negative[i]=positive[i-1]+1;
                positive[i]=negative[i-1]==0?0:negative[i-1]+1;
            }
            max=Math.max(positive[i],max);
        }
        return max;
    }
}
