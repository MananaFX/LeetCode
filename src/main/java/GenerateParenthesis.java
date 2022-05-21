import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] combination = new char[2*n];
        traceback(ans,combination,0,0);
        return ans;
    }
    public void traceback(List<String> ans , char[] current, int balance,int pos){
        if(balance<0)
            return;
        if(balance>current.length/2)
            return;
        else if (current[current.length-1] == '(' || current[current.length-1] == ')') {
            if (balance == 0) {
                ans.add(new String(current));
                return;
            } else
                return;
        }
        current[pos]='(';
        traceback(ans,current,balance+1,pos+1);
        current[pos]=' ';
        if(balance>0){
            current[pos]=')';
            traceback(ans,current,balance-1, pos+1);
            current[pos]=' ';
        }
    }
    public static void main(String[] args){
        System.out.println(new GenerateParenthesis().generateParenthesis(3));
    }

}
