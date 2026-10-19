class Runningsum {
    public int[] runningSum(int[] nums) {
        int[] temp = new int[nums.length];
        int s=0;
        for(int i = 0; i < nums.length; i++){
              s+=nums[i];
              temp[i] = s;
        }
        return temp;
    }
}