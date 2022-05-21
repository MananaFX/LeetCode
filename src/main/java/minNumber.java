public class minNumber {
    public String minNumber(int[] nums) {
        if(nums.length==0)
            return "";
        if(nums.length==1)
            return String.valueOf(nums[0]);
        sort(nums,0,nums.length-1);
        String ans="";
        for(int i=0;i<nums.length;i++)
            ans+=String.valueOf(nums[i]);
        return ans;
    }
    public String build(int i,int j){
        return String.valueOf(i)+String.valueOf(j);
    }
    public void sort(int[] nums,int i,int j){
        if(i<j){
            int point = partion(nums,i,j);
            sort(nums,i,point-1);
            sort(nums,point+1,j);
        }
    }
    public int partion(int[] nums, int i,int j){
        int x = nums[i];
        int left=i;
        int right=j+1;
        while(true){
            while(right>i && build(x,nums[--right]).compareTo(build(nums[right],x))<0);
            while(left<j && build(x,nums[++left]).compareTo(build(nums[left],x))>0);
            if(right<=left)
                break;
            int tmp=nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
        }
        int tmp=nums[i];
        nums[i]=nums[right];
        nums[right]=tmp;
        return right;
    }
    public static void main(String[] args){
        int[] nums = new int []{8,7,9};
        System.out.println(new minNumber().minNumber(nums));
    }
}
