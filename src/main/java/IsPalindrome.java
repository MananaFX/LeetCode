public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = "";
        s = Integer.toString(x);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
