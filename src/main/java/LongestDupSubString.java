public class LongestDupSubString {
    public String longestDupSubstring(String s) {
        String ans="";
        int position = 0;
        int length=0;
        int[] m = new int[s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>0;j--){
                if(i!=j&&s.charAt(i)==s.charAt(j)){
                    if(i==0)
                        m[j]=1;
                    else
                        m[j]=m[j-1]+1;
                    if(m[j]>length){
                        length=m[j];
                        position=j;
                    }
                }else
                    m[j]=0;
            }
            m[i]=0;
        }
        if(length==0)
            return ans;
        for(int i=length-1;i>=0;i--)
            ans+=s.charAt(position-i);
        return ans;
    }
    public static void main(String[] args){
        String s = "abcd";
        System.out.println(new LongestDupSubString().longestDupSubstring(s));
    }
}
