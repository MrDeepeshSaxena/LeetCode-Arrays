import java.util.Arrays;

public class Count_Prefixes_of_a_Given_String_2255 {
    public int countPrefixes(String[] words, String s) {
        return (int) Arrays.stream(words).filter(word -> s.startsWith(word)).count();
    }
}
