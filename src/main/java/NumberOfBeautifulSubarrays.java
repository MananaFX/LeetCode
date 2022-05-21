public class NumberOfBeautifulSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] odds= new int[nums.length+2];
        int j=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1)
                odds[j++]=i;
        }
        if(j-1<k)
            return 0;
        odds[0]=-1;
        odds[j]=nums.length;
        for(int i=1;i<=j-k;i++)
                ans+=(odds[i]-odds[i-1])*(odds[i+k]-odds[i+k-1]);
        return ans;
    }
    public static void main(String args[]){
        System.out.println(new NumberOfBeautifulSubarrays().numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }
}
