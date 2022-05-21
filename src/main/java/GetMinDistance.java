public class GetMinDistance {
    public int getMinDistance(int[] nums, int target, int start) {
        int i=0;
        for(i = 0 ;start-i >= 0 && start+i < nums.length; i++){
            if(nums[start+i]==target||nums[start-i]==target)
                return i;
        }
        int j=i;
        while(start+j<nums.length)
            if(nums[start+j]==target)
                return j;
            else
                j++;
        while(start-j>=0)
            if(nums[start-j]==target)
                return j;
            else
                j++;
        return 0;
    }
}
