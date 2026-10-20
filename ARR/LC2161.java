package ARR;
class LC2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int n  = nums.length;
        int[] ans = new int[n];
        int k = 0;
        for(int x: nums){
            if(x < pivot){
                ans[k++] = x;
            }
        }
        for(int x: nums){
            if(x == pivot){
                ans[k++] = x;
            }
        }
        for(int x: nums){
            if(x > pivot){
                ans[k++] = x;
            }
        }
        for(int i = 0; i < n; i++){
            nums[i] =ans[i];
        }
        return nums;
    }
}