public class MissinNo {
    public int missingNumber(int[] nums) {
        int XOR = nums.length;    
        for(int i = 0; i<nums.length; i++){
            XOR = XOR^i^nums[i];
        }
        return XOR;
    }
}
