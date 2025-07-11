class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            else{
                int max=prices[i]-minPrice;
                if(max>maxProfit){
                    maxProfit=max;
                }
            }
        }
        return maxProfit;
    }
}