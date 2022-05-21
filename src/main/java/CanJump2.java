public class CanJump2 {
    public int jump(int[] nums) {
        int i=nums.length-1;
        int furthest=nums.length-1;
        int time=0;
        if(nums.length==1)
            return 1;
        while(i>=0){
            for(int j=0;j<furthest;j++){
                if(nums[j]>=furthest-j){
                    furthest=j;
                    i=j-1;
                    time++;
                }
            }
        }
        return time;
    }
    public static void main(String[] args){
        System.out.println(new CanJump2().jump(new int[] {2,3,1,1,4}));
    }
}
