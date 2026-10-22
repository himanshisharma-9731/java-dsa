package TBU;

public class LC3942 {
    

    public int minOperations(int[] nums) {
        int n = nums.length;

        boolean normal = true;
        boolean reversed = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] != (nums[0] + i) % n) {
                normal = false;
            }

            if (nums[i] != (nums[0] - i + n) % n) {
                reversed = false;
            }
        }

        int ans = Integer.MAX_VALUE;

        // Case 1: Rotation of sorted order
        if (normal) {
            int k = nums[0];

            if (k == 0) {
                ans = 0;
            } else {
                ans = Math.min(n - k, k + 2);
            }
        }

        // Case 2: Rotation of reversed sorted order
        if (reversed) {
            int k = n - 1 - nums[0];

            ans = Math.min(ans, Math.min(k + 1, n - k + 1));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}


