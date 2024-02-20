import java.util.Arrays;

public class Counting_Words_With_a_Given_Prefix_2185 {
    public int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words).filter(w -> w.startsWith(pref)).count();
    }
}
