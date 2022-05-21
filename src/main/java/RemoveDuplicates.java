public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = -1;
        for(int i = 1 ; i < nums.length ;i++){
            if(nums[i] == nums[i-1] && index == -1){
                index = i;
            }else if(nums[i] != nums[i-1] && index != -1){
                nums[index] = nums[i];
                index++;
            }
        }
        index = index == -1 ? nums.length : index;
        return index;
    }
    public static void main(String[] args){
        System.out.println(new RemoveDuplicates().removeDuplicates(new int[] {1,2}));
    }
}
