public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int p=0,q=1,r=2;
        for(int i=2;i<n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
