public class SearchRange {
   
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums,target);
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last = findlast(nums , target);
        return new int[]{first , last};
    }
    private int findfirst(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid]== target){
                res = mid;
                high = mid - 1;
            }
            else if(target > nums[mid] ){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }            
        }
        return res;
    }
     private int findlast(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid]== target){
                res = mid;
                low = mid + 1;
            }
            else if(target < nums[mid] ){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }            
        }
        return res;
     }

}
