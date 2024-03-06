import java.util.Arrays;

public class Count_the_Number_of_Vowel_Strings_in_Range_2586 {
    public int vowelStrings(String[] words, int left, int right) {
        return (int) Arrays.asList(words)
                .subList(left, right + 1)
                .stream()
                .filter(word -> isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1)))
                .count();
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
