public class Maximum_Value_of_a_String_in_an_Array_2496 {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for (final String s : strs)
            ans = Math.max(ans, s.chars().anyMatch(c -> Character.isAlphabetic(c)) ? s.length()
                    : Integer.valueOf(s));
        return ans;
    }
}
