public class MaxProfit2 {
    public int maxProfit2(int[] prices) {
        int low=prices[0];
        int profit=0;
        int num=0;
        for(int j=1;j< prices.length;j++){
            if(prices[j]-low>profit){
                profit=prices[j]-low;
            }else{
                num+=profit;
                if(profit!=0)
                    low=10000000;
                profit=0;
                low=Math.min(prices[j],low);
            }
        }
        num+=profit;
        return num;
    }
    public static void main(String[] args) {
        new MaxProfit2().maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
    }
}
