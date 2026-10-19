package ARR;
public class TwoSum2 {
    
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int j = n - 1;
        int i = 0;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[] {i+1, j+1};
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
       
        return new int[] {-1,-1};
    }    
}
