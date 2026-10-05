public class pivotIndex {
    
    public int pivotIndex(int[] nums) {
        int left = 0;
        int n = nums.length;
        int sum = Sum(nums,0, n);         
        for(int i = 0; i < n; i++){
            int right = sum - nums[i] - left;
            if(right == left){
                return i;
            }
            left +=nums[i];
        }
        return -1;
    }
    public int Sum(int[] a, int s, int f){
        int add = 0;
        for(int i = s ; i <f; i++ ){
            add +=a[i];
        }
        return add;
    }
}
// class Solution {
//     public int pivotIndex(int[] nums) {
//         /* we can try the two pointer approach like ek pointer ek dum left side ko point krega and then ek n -1 
//         fir or ek mid ko rkh skte hai n/2  if low + 1 to high == 0 hai to return low if noe then low ko + 1 kar skte hai  */
//         int low = 0;
//         int n = nums.length;
//         int high = n ;
//         int sumL = 0;
//         int sumR = 0;
//         while(low < high){          
//             sumR = Sum(nums, low+1, high);          
//             sumL = Sum(nums, 0, low);          
//           if(sumR == sum){
//             return low;
//           }           
//         }
//         return -1;
//     }
//     public int Sum(int[] a, int s, int f){
//         int add = 0;
//         for(int i = s ; i <f; i++ ){
//             add +=a[i];
//         }
//     }
// }
