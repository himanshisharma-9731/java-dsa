package ARR;
import java.util.*;
class LC3sumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < n-2; i++){
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    l++;
                }
                else{
                    r--;
                }
                int DiffTr = Math.abs(sum - target);
                if(DiffTr < minDiff){
                    res = sum;
                    minDiff = DiffTr;  
                }
            }
        }
        return res;
    }
}