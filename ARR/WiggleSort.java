package ARR;

import java.util.Arrays;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int left = (n - 1) / 2;
        int right = n - 1;
        for(int i = 0; i < n; i++ ){
            if(i % 2 == 0){
                nums[i] = arr[left];
                left--;
            }
            else{
                nums[i] = arr[right];
                right--;
            }
        } 
    }
}
// import java.util.Arrays;

// class Solution {
//     public void wiggleSort(int[] nums) {
//         int n = nums.length;
//         int[] sorted = nums.clone();
//         Arrays.sort(sorted);

//         // Point to the end of the smaller and larger halves
//         int mid = (n - 1) / 2;
//         int right = n - 1;

//         // Place elements in reverse order to keep duplicate medians apart:
//         // Odd indices receive the larger half
//         for (int i = 1; i < n; i += 2) {
//             nums[i] = sorted[right--];
//         }

//         // Even indices receive the smaller half
//         for (int i = 0; i < n; i += 2) {
//             nums[i] = sorted[mid--];
//         }
//     }
// }
