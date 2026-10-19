package ARR;
public class RearrangeBySign {
    public int[] rearrangeArray(int[] nums) {
        int posI = 0;
        int negI = 1;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] < 0){
                ans[negI] = nums[i];
                negI += 2;
            }
            else{
                ans[posI] = nums[i];
                posI += 2;
            }
        }
        return ans;
    }
}

