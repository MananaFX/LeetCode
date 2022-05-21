public class RobotMovingCount {
    int num;
    public int movingCount(int m, int n, int k) {
        int[][] array =new int[m][n];
        recur(array,m,n,0,0,k);
        return num;
    }
    public boolean recur(int[][] array,int m,int n,int x,int y, int k){
        if(x<0||x>=n||y<0||y>=m||array[y][x]==1||!isLegal(x,y,k))
            return false;
        num+=1;
        array[y][x]=1;
        boolean res= recur(array,m,n,x,y+1,k)||recur(array,m,n,x,y-1,k)||recur(array,m,n,x+1,y,k)||recur(array,m,n,x-1,y,k);
        return res;
    }
    public boolean isLegal(int m, int n,int k){
        int ans=0;
        while(m>0||n>0){
            ans+=m%10+n%10;
            m=m/10;
            n=n/10;
        }
        if(ans>k)
            return false;
        else
            return true;
    }
    public static void main(String[] args){
        int ans = new RobotMovingCount().movingCount(2,3,1);
        System.out.println(ans);
    }
}
