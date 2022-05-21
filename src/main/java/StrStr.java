public class StrStr {
    public int strStr(String haystack, String needle) {
        int index = 0;
        if(needle.equals(""))
            return 0;
        for(int i = 0 ; i<haystack.length() ; i++){
            if(haystack.charAt(i) == needle.charAt(index)){
                index++;
            }else{
                i = i-index+1;
                index = 0;
            }
            if(index == needle.length())
                return i-index+1;
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(new StrStr().strStr("mississippi"
                ,"issip"));
    }
}
