public class DeleteAndEarnPoint {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int MaxVal=0;
        for(int i=0;i<nums.length;i++)
            MaxVal=Math.max(MaxVal,nums[i]);
        int[] profit = new int[MaxVal+1];
        for(int i=0;i<nums.length;i++)
            profit[nums[i]]+=nums[i];
        return rob(profit);
    }
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int p =Math.max(nums[0],nums[1]);
        if(nums.length==2)
            return p;
        int q=nums[0],r=p;
        for(int i=2;i<nums.length;i++){
            p=q;
            q=r;
            r=Math.max(nums[i]+p,q);
        }
        return r;
    }
    public static void main(String[] args){
        System.out.println(new DeleteAndEarnPoint().deleteAndEarn(new int[] {3,4,2}));
    }
}
