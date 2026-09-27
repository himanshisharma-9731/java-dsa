import java.util.*;

class ArraySum {
    public static int[] twoSum(int[] nums, int target) {
         int n = nums.length;
         if(n < 2) {
         return new int[]{-1, -1};
        }

         for(int i = 0; i<n-1; i++){
             for(int j =i+1; j<n; j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
                
             }
         }
         return new int[]{-1}; 
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] nums =new int[s]; 
        for(int i=0; i<s; i++){
            nums[i]=sc.nextInt();
        } 
        System.out.println("Enter the element you want to find:");
        int target = sc.nextInt();
        int[] x = twoSum(nums, target);
        if(x[0]==-1){
             System.out.println("Elements not found in the array");
        }
        else{
            System.out.println(x[0]);
            System.out.println(x[1]);
         }
    }
    
}