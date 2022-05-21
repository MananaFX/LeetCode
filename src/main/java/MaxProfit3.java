public class MaxProfit3 {
    public int maxProfit3(int[] prices) {
        int[][] profit= new int [prices.length][3];
        //profit[i][0] 持有这支股票
        //profit[i][1] 不持有，冷冻期中
        //profit[i][2] 不持有，不在冷冻期中
        profit[0][0] = -prices[0];
        profit[0][2] = 0;
        for(int i=1; i<prices.length;i++){
            profit[i][0]=Math.max(profit[i-1][0],profit[i-1][2]-prices[i]);
            profit[i][1]=profit[i-1][0]+prices[i];
            profit[i][2]=Math.max(profit[i-1][1],profit[i-1][2]);
        }
        return Math.max(Math.max(profit[prices.length-1][0],profit[prices.length-1][1]),profit[prices.length-1][2]);

    }
    public static void main(String[] args) {
        System.out.println(new MaxProfit3().maxProfit3(new int[]{1,2,3,0,2}));
    }
}
