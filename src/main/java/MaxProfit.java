public class MaxProfit {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int profit=0;
        for(int j=1;j< prices.length;j++){
            profit=Math.max(profit,prices[j]-low);
            low=Math.min(low,prices[j]);
        }
        return profit;
    }
}
