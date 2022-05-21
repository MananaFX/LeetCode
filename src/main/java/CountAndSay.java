public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String pre = countAndSay(n-1);
        char charAt = pre.charAt(0);
        int num = 1;
        String ans = "";
        for (int i = 1 ; i < pre.length() ; i++){
            if(pre.charAt(i) == charAt){
                num++;
            }else{
                ans+= Integer.toString(num)+Character.toString(charAt);
                charAt = pre.charAt(i);
                num = 1;
            }
        }
        ans+= Integer.toString(num)+Character.toString(charAt);
        return ans;
    }
    public static void main(String[] args){
        System.out.println(new CountAndSay().countAndSay(5));
    }
}
