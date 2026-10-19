class buy_SellStock {
    public int maxProfit(int[] prices) {
    
       int buy = prices[0];//represents the buy date
       
       int n = prices.length;
       int profit = 0;
       for(int i = 1; i < n; i++){
          if(prices[i] < buy){
            buy = prices[i];
          }
          else{
             int p = prices[i] - buy;
             
             if(p > profit){
                profit = p;
               
             }
          }       
       } 
       return profit;
    }
}