import java.util.ArrayList;
import java.util.List;

public class Candies {
      class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        for(int x : candies){
            if(x > maxi){
                maxi = x;
            }
        }
        List<Boolean>arr = new ArrayList<>(candies.length);
       for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxi){
                 arr.add(true);
             }
            else{
                  arr.add(false);
            }
       }
       return arr;
    }
}   
}
