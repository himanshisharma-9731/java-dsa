public class ArrSortParity {

    public int[] sortArrayByParity(int[] nums) {
        int j = 0;
        // int n = nums.length;
        for(int i = 0; i<nums.length; i++){
           
            if(nums[i] == 0 || nums[i]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}

/*better approach :--

int left =0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] % 2 !=0 && nums[right] %2 ==0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }else{
                if(nums[left] %2 ==0){
                    left++;
                }
                if(nums[right] %2 !=0){
                    right--;;
                }
            }
        }return nums;
        */
