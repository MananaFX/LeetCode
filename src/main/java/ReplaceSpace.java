public class ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                ans.append("%20");
            else
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(new ReplaceSpace().replaceSpace("We are happy."));
    }
}
