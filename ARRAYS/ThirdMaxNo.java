public class ThirdMaxNo {
    class Solution {
    public int thirdMax(int[] nums) {

        int n = nums.length;

        if (n < 3) {
            int maxi = nums[0];

            for (int i = 1; i < n; i++) {
                maxi = Math.max(maxi, nums[i]);
            }

            return maxi;
        }

        long maxi = Long.MIN_VALUE;
        long prevmax = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (nums[i] == maxi || nums[i] == prevmax || nums[i] == third) {
                continue;
            }

            if (nums[i] > maxi) {
                third = prevmax;
                prevmax = maxi;
                maxi = nums[i];
            }
            else if (nums[i] > prevmax) {
                third = prevmax;
                prevmax = nums[i];
            }
            else if (nums[i] > third) {
                third = nums[i];
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) maxi;
        }

        return (int) third;
    }
}
}
