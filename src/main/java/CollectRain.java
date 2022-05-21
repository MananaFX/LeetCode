public class CollectRain {
    public int collectRain(int[] height) {
        if(height.length==1)
            return 0;
        int[] leftHeight = new int[height.length];
        int[] rightHeight = new int[height.length];
        int ans=0;
        int tmp;
        leftHeight[0]=height[0];
        rightHeight[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
            leftHeight[i]=Math.max(leftHeight[i-1],height[i]);
        for(int i=height.length-2;i>=0;i--)
            rightHeight[i]=Math.max(rightHeight[i+1],height[i]);
        for(int i=1;i<height.length-1;i++){
            tmp=Math.min(leftHeight[i],rightHeight[i]);
            ans+=tmp-height[i];
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(new CollectRain().collectRain(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
