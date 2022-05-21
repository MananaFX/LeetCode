public class NumberDecodings {
    public int numDecodings(String s) {
        int[] numbers= new int[s.length()];
        int i=0;
        if(s.charAt(0)=='0')
            return 0;
        else
            numbers[0]=1;
        for(i=1;i<s.length();i++){
            if(s.charAt(i)=='0')
                numbers[i]=numbers[i-1];
            else if(s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
                numbers[i]=numbers[i-1];
            else{
                if(i<s.length()-1&&s.charAt(i+1)=='0')
                    numbers[i]=numbers[i-1];
                else{
                    if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2')
                        numbers[i]=numbers[i-1]+1;
                    else
                        numbers[i]=numbers[i-1];
                }
            }
        }
        return numbers[s.length()-1];
    }
    public static void main(String[] args){
        String a = "2101";
        System.out.println(new NumberDecodings().numDecodings(a));
    }
}
