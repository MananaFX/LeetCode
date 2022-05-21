public class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = remove(s,'(',')');
        return remove(result.reverse().toString(),')','(').reverse().toString();
    }
    public StringBuilder remove(String s,char open,char close){
        StringBuilder sb = new StringBuilder();
        int balance=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==open)
                balance++;
            else if(c==close){
                if(balance==0)
                    continue;
                balance--;
            }
            sb.append(c);
        }
        return sb;
    }
}
