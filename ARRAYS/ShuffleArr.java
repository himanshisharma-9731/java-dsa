public class ShuffleArr {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] a1 = new int[n];
        for(int i = 0; i < n; i++ ){
             a1[i] =nums[i]; 
        }
        int[] a2 = new int[n];
        for(int i = n; i < l; i++){
            a2[i-n] = nums[i];
        }

        
        for(int i = 0; i < n; i++){
         nums[2*i] = a1[i];
         nums[2*i+1] = a2[i];
        }
        return nums;
    }
}
