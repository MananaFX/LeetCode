public class CanJump {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
            return true;
        int furthest = nums[0];
        int i=0;
        while(i<=furthest){
            if(nums[i]>=nums.length-i-1)
                return true;
            furthest=Math.max(furthest,i+nums[i]);
            i++;
        }
        return false;
    }
     public static void main(String[] args){
        System.out.println(new CanJump().canJump(new int[] {1,2,3}));
     }
}
