public class Rob {
    /******
     * 偷窃第 kk 间房屋，那么就不能偷窃第 k-1k−1 间房屋，偷窃总金额为前 k-2k−2 间房屋的最高总金额与第 kk 间房屋的金额之和。
     *
     * 不偷窃第 kk 间房屋，偷窃总金额为前 k-1k−1 间房屋的最高总金额。
     *
     */
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int p =Math.max(nums[0],nums[1]);
        if(nums.length==2)
            return p;
        int q=nums[0],r=p;
        for(int i=2;i<nums.length-1;i++){
            p=q;
            q=r;
            r=Math.max(nums[i]+p,q);
        }
        q=nums[1];
        int z=Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){
            p=q;
            q=z;
            z=Math.max(nums[i]+p,q);
        }
        return Math.max(r,z);
    }
    public static void main(String[] args){
        int[] i ={2,7,9,3,1};
        System.out.println(new Rob().rob(i));
    }
}
