public class Tribonacci {
    public int tribonacci(int n) {
        if(n<3){
            if(n==0)
                return 0;
            else
                return 1;
        }
        int p=0,q=0,r=1,s=1;
        for(int i=3;i<n;i++){
            p=q;
            q=r;
            r=s;
            s=p+q+r;
        }
        return s;
    }
    public static void main(String[] args){
        new Tribonacci().tribonacci(4);
    }
}
