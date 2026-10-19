import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrArr {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                res.add(i);
            }
        }
        return res;
    }
}
