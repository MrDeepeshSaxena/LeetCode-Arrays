import java.util.Arrays;

public class Count_the_Number_of_Consistent_Strings_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        return (int) Arrays.stream(words)
                .filter(word -> word.matches(String.format("[%s]*", allowed)))
                .count();
    }
}
