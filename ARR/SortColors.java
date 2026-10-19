public class SortColors {  
    public void sortColors(int[] nums) {
      int n = nums.length;
      int low = 0;
      int mid = 0;
      int high = n - 1;   
      for( int i = mid; mid <= high; i++){
        if(nums[mid] == 0){
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;

            low++;
            mid++;
        }
        else if(nums[mid] == 1){
            mid++;
        }
        else{
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        }
      }
    }
}

