public class Richest {
   class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
       
        for(int i = 0; i < accounts.length; i++){
             int check =  0;
            for(int j = 0; j < accounts[i].length; j++){
                check += accounts[i][j];
            }
            richest = Math.max(check, richest);
        }
        return richest;
    }
}   
}
