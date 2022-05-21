public class MaxProfit4 {
    public int maxProfit4(int[] prices, int fee) {
        int[][] profit = new int [prices.length][2];
        //profit[0][0]  持有，[1]未持有
        profit[0][0] = 0-prices[0]-fee;
        profit[0][1] = 0;
        for(int i=1;i<prices.length;i++){
            profit[i][0]=Math.max(profit[i-1][1]-fee-prices[i],profit[i-1][0]);
            profit[i][1]=Math.max(profit[i-1][1],profit[i-1][0]+prices[i]);
        }
        return Math.max(profit[prices.length-1][0],profit[prices.length-1][1]);
    }
}
