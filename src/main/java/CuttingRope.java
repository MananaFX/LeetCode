public class CuttingRope {
    public int cuttingRope(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int[] maxMul=new int[n+1];
        maxMul[2]=2;//赋值为2，不为答案，用于下面计算
        maxMul[3]=3;//赋值为3，同理
        for(int i=4;i<=n;i++){
            for(int j=2;j<=i/2;j++){
                maxMul[i]=Math.max(maxMul[i],maxMul[j]*maxMul[i-j]);
            }
        }
        return maxMul[n];
    }
    public static void main(String[] args){
        System.out.println(new CuttingRope().cuttingRope(10));
    }
}
