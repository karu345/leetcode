class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyP = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > buyP){
                int profit = prices[i] - buyP;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyP = prices[i];
            }
        }
        return maxProfit;
    }
}