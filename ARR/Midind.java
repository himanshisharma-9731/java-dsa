import ARR;
class Midind {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        for (int mid = 0; mid < n; mid++) {
            int sumleft = sumleft(nums, mid);
            int sumright = sumright(nums, mid);

            if (sumleft == sumright) {
                return mid;
            }
        }

        return -1;
    }

    public int sumleft(int[] a, int mid) {
        int sum = 0;

        for (int i = 0; i < mid; i++) {
            sum += a[i];
        }

        return sum;
    }

    public int sumright(int[] a, int mid) {
        int sum = 0;

        for (int i = mid + 1; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}
```