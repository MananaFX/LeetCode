public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==2)
            return Math.min(cost[0],cost[1]);
        int[] mincost = new int[cost.length+1];
        mincost[0]=0;mincost[1]=0;
        for(int i=2;i<cost.length+1;i++){   //求到第n层（n == cost.length)最小体力
            mincost[i]=Math.min(mincost[i-2]+cost[i-2],mincost[i-1]+cost[i-1]);
        }
        return mincost[cost.length];
    }
}
