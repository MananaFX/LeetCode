import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        HashMap<Character, String> hashMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        traceback(0,hashMap,ans,digits,new StringBuffer());
        return ans;
    }
    public static void traceback(int index,HashMap<Character,String> hashMap,List<String> ans,String digits,StringBuffer charComb){
        if(index==digits.length()){
            ans.add(charComb.toString());
            return;
        }
        String charOfdigits = hashMap.get(digits.charAt(index));
        for(int i=0;i<charOfdigits.length();i++){
            charComb.append(charOfdigits.charAt(i));
            traceback(index+1,hashMap,ans,digits,charComb);
            charComb.deleteCharAt(index);
        }

    }
}
