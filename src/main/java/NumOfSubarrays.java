public class NumOfSubarrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=k*threshold)
            ans++;
        for(int i=1;i+k<=arr.length;i++){
            sum-=arr[i-1];
            sum+=arr[i+k-1];
            if(sum>=k*threshold){
                System.out.println(arr[i]+"  "+arr[i+k-1]);
                ans++;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(new NumOfSubarrays().numOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
    }
}
