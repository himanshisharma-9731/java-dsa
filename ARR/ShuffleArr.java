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
/*class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++) {
            if(i%2==0){
                arr[i]=nums[a];
                a++;
            }
            else{
                arr[i]=nums[n];
                n++;
            }
        }
        return arr;
    }
} */