package ARR;
public class SqSortArr {
   
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int lp = 0;
        int rp = n-1;
        int ans[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            if(Math.abs(nums[lp]) > Math.abs(nums[rp]) ){
                ans[i] = nums[lp] * nums[lp];
                lp++;
            }
            else{
               ans[i] = nums[rp] * nums[rp];
               rp--;
            }
        }
        return ans;
    }
}

