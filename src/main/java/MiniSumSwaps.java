public class MiniSumSwaps {
    public int minimumSwap(String s1, String s2) {
        int sum=0;
        for(int i=0; i<s1.length(); i++){ //no solution
            if(s1.charAt(i)=='y')
                sum++;
            if(s2.charAt(i)=='y')
                sum++;
        }
        if(sum%2!=0)
            return -1;

        sum=0;
        int type1=0;
        int type2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.charAt(i)=='x')
                    type1++;
                else
                    type2++;
            }
        }
        if(type1%2==0)
            return type1/2+type2/2;
        else
            return type2/2+2+(type1-1)/2;
    }
    public static void main(String[] args){
        System.out.println(new MiniSumSwaps().minimumSwap("xxyyxyxyxx", "xyyxyxxxyx"));
    }
}
