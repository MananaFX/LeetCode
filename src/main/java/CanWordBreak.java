import java.util.*;

public class CanWordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaaa");
        System.out.println(new CanWordBreak().wordBreak("aaaaaaa",list));
    }
}
