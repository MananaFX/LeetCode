public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length == 1)
            if(target == nums[0])
                return new int[] {0,0};
            else
                return new int[] {-1,-1};
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > target)
                right = mid - 1;
            else if(nums[mid] < target)
                left = mid + 1;
            else{
                left = mid;
                right = mid;
                while(left >= 0 && nums[left] == nums[mid])
                    left--;
                //left = left==0 ? 0:left+1;
                while(right <= nums.length-1 && nums[right] == nums[mid])
                    right++;
                //right = right==nums.length-1 ? nums.length-1 : right-1;
                break;
            }
        }
        if(left > right)
            return new int[] {-1,-1};
        else
            return new int[] {left+1,right-1};
    }
    public static void main(String[] args){
        System.out.println(new SearchRange().searchRange(new int[] {2,2},2));
    }
}
