public class MaxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=0;
        int max=values[0]+0;
        for(int j=1;j<values.length;j++){
            ans=Math.max(ans,max+values[j]-j);
            max=Math.max(max,values[j]+j);
        }
        return ans;
    }
}
