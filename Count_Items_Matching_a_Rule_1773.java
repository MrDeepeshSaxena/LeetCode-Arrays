import java.util.List;

public class Count_Items_Matching_a_Rule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = ruleKey.charAt(0) == 't' ? 0 : (ruleKey.charAt(0) == 'c' ? 1 : 2);
        int ans = 0;
        for (var v : items) {
            if (v.get(i).equals(ruleValue)) {
                ++ans;
            }
        }
        return ans;

    }
}
