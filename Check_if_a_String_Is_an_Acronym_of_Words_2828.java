import java.util.List;

public class Check_if_a_String_Is_an_Acronym_of_Words_2828 {
    public boolean isAcronym(List<String> words, String s) {
        String acronym = "";
        for (String word : words) {
            acronym += word.charAt(0);
        }
        return acronym.equals(s);
    }
}
